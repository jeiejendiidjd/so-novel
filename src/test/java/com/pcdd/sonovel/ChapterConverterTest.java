package com.pcdd.sonovel;

import com.pcdd.sonovel.core.ChapterConverter;
import com.pcdd.sonovel.model.Chapter;
import org.junit.jupiter.api.Test;

class ChapterConverterTest {

    @Test
    void test01() {
        Chapter chapter = Chapter.builder().title("1046.出兵进襄").content("""
                <div id="content_tip"><b>最新网址：www.xbiqugu.net</b></div>&nbsp;&nbsp;&nbsp;&nbsp;说罢，苏泉荡的表情陡然正经起来。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;“刘再远、刘子俊、肖玉林听令！”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;刘再远、刘子俊、肖玉林三人顿时都是站起身来，拱手道：“末将在！”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;虽刘子俊、肖玉林并非是苏泉荡镇北军区的人，但现在苏泉荡手持赵洞庭密信，是代赵洞庭传令。他们当然需得郑重。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;苏泉荡又道：“你们今夜便吩咐下去，明日军中铁骑先行，火速拿下襄阳府！”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;“是！”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;刘再远等人当即领命。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这场颇为热络的接风宴，也因此而提前结束。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;刘子俊、文起等人各自回到军中，准备出城事宜。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;翌日上午，刘再远和肖玉林两人便是率着三军中铁骑直接出城，先行向着襄阳府而去。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;文起也紧接着率军前往常德府。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;到下午，刘子俊也率领三军中步卒，携带着辎重，往襄阳府去。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;元朝中都。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;周兴也是收到赵洞庭的回信。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他看过以后，再度前往皇宫求见忽必烈。只见到的，自然仍是桑哥。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;两人刚刚才在中书省衙门内见面，桑哥就有些迫切地问周兴道：“周大人可收到贵朝皇帝的授意了？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;也怪不得他这般迫切。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;虽然忽必烈有胆量敢不和宋朝议和，和赵洞庭讨价还价，但他桑哥却是没有的。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;因为忽必烈卧病在床了，而且身体状况实在算不得好。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈作为元皇，他思量事情自是以整个国家大局为重。但桑哥作为臣子，且是忽必烈亲信大臣，他不得不为储君筹谋。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他既然已经答应忽必烈辅佐真金，就必然先需要让真金先稳稳妥妥坐上皇位。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;而若是大军数十万仍旧压在宋国北疆，纵是真金回到国都内，又拿什么去震慑国内那些蠢蠢欲动的人呢？
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;为了皇位，有许多人都是愿意铤而走险的，甚至是丧心病狂都说不定。单单以国都内禁军，未必能震慑住所有人。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;耶律铸必须让真金能拥有震慑全国的兵权，才能够保证真金无惊无险成为新皇。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;所以，他心里自然要比忽必烈迫切得多，希望这议和之事越早达成越好。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;说话间，双眼已是忍不住直勾勾盯着周兴。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;纵是以他城府，这刻也做不到云淡风轻。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;周兴闻却是轻笑，道：“我的确已经收到我朝皇上授意了。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥道：“如何？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;周兴道：“我朝皇上愿意纳图兰朵公主为妃，不过贵朝大军得立刻撤出我朝北疆，且将淮南西路等路让出来。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥心中悄然松口气。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;还好，这议和之事算是尘埃落定。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他顾不得在拿腔做调，直接说道：“好，既如此，那我们这便可以签订议和文书。本官这便去请示皇上，让皇上下令让大军撤回国内。只淮南东路等地官吏、守军等要撤退却并非是短时间内就可做到的事情，贵朝总会给我朝些许时间做准备吧？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;周兴轻轻点头，“至多两月。贵朝何时让出这些地境，我朝便何时将贵朝降卒给送回来。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥轻轻点头，不再多。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;随即，他便就在这房间内写下了议和文书。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;待得周兴看过，点头以后，就立刻又拿着文书去见忽必烈去了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;文书条款不过三条。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;为体恤天下苍生，宋元两国愿就此达成议和。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;宋皇迎娶元明珠公主为妃。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;大元立刻撤出囤积于大宋北疆将士。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;两月内，大元让得淮南西路、江南东路、两浙西路、两浙东路以及淮南东路。何时易手，大宋何时放回大元众被俘将士。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;最后，就是愿两朝达成永久和平，不再兵锋相向云云。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这些自然都是屁话。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;两国都已经打到这个份上，大宋险些被灭国，元朝在宋帝内损兵折将也有近百万众。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这简直是滔天的血海之仇了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;两国根本就没有保持永久和平的可能。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;当桑哥再度在忽必烈的寝宫见到忽必烈时，虽只两日，但忽必烈的身体状况好似更差了些。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥在他旁边连唤他几声，他才是幽幽醒转过来。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这让得桑哥心中不住叹息。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;谁也不曾料到，原本身体算得英朗的忽必烈竟会说跨就垮下来。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;哪怕以前忽必烈率军出征时受伤，那也都是精神奕奕，桑哥这么多年都还从未见过他这般虚弱的样子。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;到底是老了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他们都不再年轻了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥强忍着眼中的些许酸涩，将议和文书拿出来，对忽必烈道：“皇上qi，这是两朝议和文书，请您过目。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他将议和文书摊在忽必烈的眼前。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈眯起眼睛看着。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;身子虚弱，他似乎连视力都大不如前了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;直过去数分钟，他才缓缓道：“没有问题。就这般和宋朝议和吧，图兰朵嫁宋之事，便交给你去安排了。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥轻轻点头，“那便请皇上盖下大印吧……”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈挥了挥手。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;有老太监从书案上捧起玉玺，郑重其事地递到他的旁边。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈将玉玺盖在议和文书上。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这点力气他还是有的。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;只然后，他便又缓缓闭上了眼睛。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥持着议和文书出去。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他回到中书省衙门，再见到周兴，将议和文书递给周兴。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这议和文书虽然实际上并没有太大的意义，但还是需要他将其传回长沙，等赵洞庭盖上大印的。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;因为以他驻元使臣之职，还不够分量在这样的议和文书上盖下大印。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;看着周兴拿着议和文书离开，耶律铸总算是重重松口气。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;现在，他只需等待真金回朝了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;当然，让图兰朵嫁宋的事情还是让他有些烦恼，因为他实在不知道该如何对图兰朵说及这事才好。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵回元以后，远远不像以前那般开朗。冒然去跟她说这事，桑哥觉得自己就算是重臣，怕也不免对图兰朵骂个狗血淋头。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这位公主耍起威风来可是不会管对方是谁的，即便是连皇帝，也不是没受过明珠公主的气。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;桑哥并不知道，就在他离开忽必烈的寝宫以后，忽必烈便让他身旁的老太监去请图兰朵到了他的寝宫内。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵本是不愿来的，不过最终还是来了。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;因为老太监对她说，皇上卧病在床。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵终不是那种铁石心肠的人。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;纵然心中对忽必烈失望甚重，但听得忽必烈卧病在床，自然也还是担忧。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;在寝宫内见到果然虚弱不堪的忽必烈，图兰朵的眼中便瞬间有担忧之色浮现出来。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;只大概是碍着颜面，她只是轻轻喊了声皇爷爷，便没有再说什么。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;但忽必烈岂能看不出她眼中的关切之色？
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;这让得忽必烈露出来些许笑容，好似连带着精神也好了数分。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;他伸手拽住图兰朵的手，轻声道：“明珠，你总算是舍得来见朕了……”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;“皇爷爷，您……”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵又喊了声，却不知道该说什么好。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈轻轻笑着，不复以往那般的严肃，道：“若非是朕病重，你大概还是不愿来见朕的吧？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵仍是没有说话。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈病重是极密，之前的确连她也不知道，更不知道忽必烈是为何而突然病倒。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;“朕……”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈拽着图兰朵的手数分钟，似也是几经挣扎，终是开口，“明珠，朕有事想求你，你可愿答应朕？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;求这个字，在忽必烈的嘴里大概是不多见的。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;连图兰朵眼中都微微露出诧异之色来，“皇爷爷有什么事？”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;忽必烈道：“朕……朕想让你嫁给宋朝皇帝未妃。”
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;图兰朵俏脸变色。
                <br>
                <br>&nbsp;&nbsp;&nbsp;&nbsp;只刹那间，她的脸色就变得极为复杂起来，愤怒、疑惑，各种情绪掺杂，但却也并没有大发雷霆。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;想和更多志同道合的人一起聊《重生之老子是皇帝》，“热度网文&nbsp;或者&nbsp;”&nbsp;与更多书友一起聊喜欢的书
                <br>
                <br><br><br><p><a href="http://koubei.baidu.com/s/xbiqugu.net" target="_blank">亲,点击进去,给个好评呗,分数越高更新越快,据说给香书小说打满分的最后都找到了漂亮的老婆哦!</a><br>手机站全新改版升级地址：https://wap.xbiqugu.net，数据和书签与电脑站同步，无广告清新阅读！</p>
                """).build();

        System.out.println(ChapterConverter.convert(chapter, "epub"));
    }

}
