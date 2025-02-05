package com.pcdd.sonovel.parse;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.ConsoleTable;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import com.pcdd.sonovel.convert.ChineseConverter;
import com.pcdd.sonovel.core.Source;
import com.pcdd.sonovel.handle.SearchResultsHandler;
import com.pcdd.sonovel.model.*;
import com.pcdd.sonovel.util.CrawlUtils;
import lombok.SneakyThrows;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

/**
 * @author pcdd
 * Created at 2024/3/23
 */
public class SearchResultParser extends Source {

    public SearchResultParser(AppConfig config) {
        super(config);
    }

    public SearchResultParser(int sourceId) {
        super(sourceId, null);
    }

    public List<SearchResult> parse(String keyword) {
        // 模拟搜索请求
        Document document;
        Connection.Response resp;
        Rule.Search r = this.rule.getSearch();
        if (r == null) {
            Console.log("书源 {} 不支持搜索", config.getSourceId());
            return Collections.emptyList();
        }

        try {
            resp = jsoup(r.getUrl().formatted(keyword))
                    .timeout(r.getTimeout())
                    .data(CrawlUtils.buildData(r.getData(), keyword))
                    .cookies(CrawlUtils.buildCookies(r.getCookies()))
                    .execute();
            document = Jsoup.parse(resp.body());
        } catch (Exception e) {
            Console.error(e.getMessage());
            return Collections.emptyList();
        }

        List<SearchResult> firstPageResults = getSearchResults(null, resp);
        if (!r.isPagination()) return SearchResultsHandler.handle(firstPageResults);

        // 搜索结果的分页 URL
        Set<String> urls = new LinkedHashSet<>();
        Elements searchPages = CrawlUtils.select(document, r.getNextPage());
        for (Element e : CollUtil.sub(searchPages, 0, r.getLimitPage() - 1)) {
            String href = CrawlUtils.normalizeUrl(e.attr("href"), this.rule.getUrl());
            // 中文解码，针对69書吧
            urls.add(URLUtil.decode(href));
        }

        // 使用并行流处理分页 URL
        List<SearchResult> additionalResults = urls.parallelStream()
                .flatMap(url -> getSearchResults(url, null).stream())
                .toList();
        // 合并，不去重（去重用 union）
        List<SearchResult> unionAll = CollUtil.unionAll(firstPageResults, additionalResults);

        return SearchResultsHandler.handle(unionAll);
    }

    @SneakyThrows
    private List<SearchResult> getSearchResults(String url, Connection.Response resp) {
        Rule.Search r = this.rule.getSearch();
        List<SearchResult> list = new ArrayList<>();
        // 搜索结果页 DOM
        Document document = resp == null
                ? jsoup(url).timeout(r.getTimeout()).get()
                : Jsoup.parse(resp.body());

        // 部分书源完全匹配时会直接跳转到详情页（搜索结果为空 && 书名不为空），故需要构造搜索结果
        if (document.select(r.getResult()).isEmpty() && !document.select(this.rule.getBook().getBookName()).isEmpty()) {
            String bookUrl = resp.url().toString();
            BookParser bookParser = new BookParser(config);
            Book book = bookParser.parse(bookUrl);

            if (StrUtil.isBlank(book.getBookName())) {
                return Collections.emptyList();
            }

            SearchResult build = SearchResult.builder()
                    .url(bookUrl)
                    .bookName(book.getBookName())
                    .author(book.getAuthor())
                    .latestChapter(book.getLatestChapter())
                    .latestUpdate(book.getLatestUpdate())
                    .build();
            list.add(build);
            Thread.sleep(CrawlUtils.randomInterval(config, false));

            return list;
        }

        Elements elements = document.select(r.getResult());
        for (Element element : elements) {
            // jsoup 不支持一次性获取属性的值
            String href = element.select(r.getBookName()).attr("href");
            String bookName = element.select(r.getBookName()).text();

            // 以下为非必须属性，需判空，否则抛出 org.jsoup.helper.ValidationException: String must not be empty
            String author = StrUtil.isNotEmpty(r.getAuthor())
                    ? CrawlUtils.selectAndInvokeJs(element, r.getAuthor(), ContentType.TEXT)
                    : null;

            String latestChapter = StrUtil.isNotEmpty(r.getLatestChapter())
                    ? element.select(r.getLatestChapter()).text()
                    : null;
            String update = StrUtil.isNotEmpty(r.getUpdate())
                    ? element.select(r.getUpdate()).text()
                    : null;

            if (bookName.isEmpty()) continue;

            SearchResult sr = SearchResult.builder()
                    .url(CrawlUtils.normalizeUrl(href, this.rule.getUrl()))
                    .bookName(bookName)
                    .author(author)
                    .latestChapter(latestChapter)
                    .latestUpdate(update)
                    .build();

            list.add(ChineseConverter.convert(sr, this.rule.getLanguage(), config.getLanguage()));
        }

        return list;
    }

    public static void printSearchResult(List<SearchResult> results) {
        ConsoleTable consoleTable = ConsoleTable.create().addHeader("序号", "书名", "作者", "最新章节", "最后更新时间");
        for (int i = 1; i <= results.size(); i++) {
            SearchResult r = results.get(i - 1);
            consoleTable.addBody(String.valueOf(i),
                    r.getBookName(),
                    r.getAuthor(),
                    r.getLatestChapter(),
                    r.getLatestUpdate());
        }
        Console.table(consoleTable);
    }

}