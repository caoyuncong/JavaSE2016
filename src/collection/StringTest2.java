package collection;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class StringTest2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String html=new String("\n" +
                "<!DOCTYPE html>\n" +
                "<html dir=\"ltr\" lang=\"zh\">\n" +
                "<head>\n" +
                "    <!-- BEGIN html head -->\n" +
                "<title>\n" +
                "走进科学</title>\n" +
                "        <meta name=\"keywords\" content=\"\"/>\n" +
                "    <meta name=\"description\" content=\"\"/>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n" +
                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"renderer\" content=\"webkit\">\n" +
                "    <meta http-equiv=\"Window-target\" Content=\"_top\">\n" +
                "    <meta name=\"baidu-site-verification\" content=\"9wC0PEtTmEqSNlOk\"/>\n" +
                "    <meta http-equiv=\"mobile-agent\"\n" +
                "          content=\"format=html5; url=//i.jandan.net/tag/%E8%B5%B0%E8%BF%9B%E7%A7%91%E5%AD%A6\">\n" +
                "                    <meta name=\"robots\" content=\"index,nofollow\">\n" +
                "        <link rel=\"stylesheet\" href=\"//cdn.jandan.net/wp-content/themes/egg/style.css?v=20160731\" type=\"text/css\"\n" +
                "          media=\"screen\"/>\n" +
                "        <link rel=\"apple-touch-icon\" href=\"//cdn.jandan.net/static/img/appicon.png\">\n" +
                "    <link rel=\"shortcut icon\" href=\"//cdn.jandan.net/static/img/favicon.ico\"/>\n" +
                "    <script>if (window != top)top.location.href = window.location.href;</script>\n" +
                "    <!--[if lt IE 9]>\n" +
                "    <script src=\"https://lib.sinaapp.com/js/jquery/1.10.2/jquery-1.10.2.min.js\"></script>\n" +
                "    <![endif]-->\n" +
                "    <!--[if gte IE 9]><!-->\n" +
                "    <script src=\"https://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js\"></script>\n" +
                "    <!--<![endif]-->\n" +
                "\t<script src=\"//cdn.jandan.net/static/js/jquery.lazyload.min.js?v=201603020\"></script>\n" +
                "    <script>\n" +
                "\t\tvar $JANDAN = {\n" +
                "\t\t\tIS_MOBILE : false,\n" +
                "\t\t\tCOOKIE_HASH : '01b0531fab6a989460dd1b231010b496',\n" +
                "\t\t\tSITE_URL : '//jandan.net',\n" +
                "            API_URL : '//api.jandan.net'\n" +
                "\t\t};\n" +
                "\t\tif (/(Android|iPhone|Windows Phone)/i.test(navigator.userAgent)) {\n" +
                "\t\t\twindow.location = '//i.jandan.net' + window.location.pathname + window.location.hash;\n" +
                "\t\t}\n" +
                "    </script>\n" +
                "    <script src=\"//cdn.jandan.net/static/js/common.js?v=2016120202\"></script>\n" +
                "    <script>\n" +
                "    eval(function(p,a,c,k,e,r){e=function(c){return c.toString(a)};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c]);return p}('(b(){0 d=[\"j\",\"a\",\"n\",\"d\",\"a\",\"n\",\".\",\"n\",\"e\",\"9\"];0 5=2 g(d.1(\\'\\')+\\'$\\');4(!5.8(c.f)){0 a=6.7.h;4(a==\\'/\\'){a=\\'\\'}6.7.i=\\'k://\\'+d.1(\\'\\')+\\'/\\'+a}l(\\'m\\',$3.o+\\'#\\'+2 p().q())})($3);',27,27,'var|join|new|JANDAN|if|r|window|location|test|t||function|document|||domain|RegExp|pathname|href||http|setCookie|jdna||COOKIE_HASH|Date|getTime'.split('|'),0,{}));\n" +
                "    </script>\n" +
                "\t\n" +
                "</head>\n" +
                "<!-- END html head -->\n" +
                "<body>\n" +
                "<!-- BEGIN wrapper -->\n" +
                "\n" +
                "<div id=\"wrapper\">\n" +
                "\n" +
                "    <!-- BEGIN header -->\n" +
                "    <div id=\"header\">\n" +
                "        <div class=\"logo\">\n" +
                "            <h1><a href=\"/\" onclick=\"ga('send', 'pageview','/header/logo');\">煎蛋</a></h1>\n" +
                "        </div>\n" +
                "        <div class=\"break\"></div>\n" +
                "        <div class=\"nav\">\n" +
                "            <ul class=\"nav-items\">\n" +
                "                <li class=\"nav-item f\"><a href=\"/\" onfocus=\"blur()\" onclick=\"ga('send', 'pageview','/header/index');\" class=\"nav-link\">首页</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link\" href=\"/new\" onfocus=\"blur()\" class=\"nav-link\" target=_blank>更新</a></li>\n" +
                "                <li class=\"nav-item x\">\n" +
                "\t                <a href=\"javascript:;\" class=\"nav-link\">专题</a>\n" +
                "\t                <div class=\"sub-items\">\n" +
                "\t\t                <table class=\"tag-cloud\">\n" +
                "\t\t\t                <thead>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <th>科学</th>\n" +
                "\t\t\t\t                <th>技术</th>\n" +
                "\t\t\t\t                <th>极客</th>\n" +
                "\t\t\t\t                <th>脑洞</th>\n" +
                "\t\t\t\t                <th>故事</th>\n" +
                "\t\t\t\t                <th>人类</th>\n" +
                "\t\t\t\t                <th>折腾</th>\n" +
                "\t\t\t\t                <th>NSFW</th>\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                </thead>\n" +
                "\t\t\t                <tbody>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/走进科学\" onfocus=\"blur()\" >走进科学</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/tech\" onfocus=\"blur()\" >TECH</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/GEEK\" onfocus=\"blur()\" >GEEK</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/DIY\" onfocus=\"blur()\" >DIY</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/冷新闻\" onfocus=\"blur()\">冷新闻</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/女性\" onfocus=\"blur()\">女性</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/减肥\" onfocus=\"blur()\">减肥</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/sex\" onfocus=\"blur()\">SEX</a></td>\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/无厘头研究\" onfocus=\"blur()\" >无厘头研究</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/人工智能\" onfocus=\"blur()\" >人工智能</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/MEME\" onfocus=\"blur()\" >MEME</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/艺术\" onfocus=\"blur()\" >艺术</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/爷有钱\" onfocus=\"blur()\" >爷有钱</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/熊孩子\" onfocus=\"blur()\" >熊孩子</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/整形\" onfocus=\"blur()\" >整形</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/wtf\" onfocus=\"blur()\" >WTF</a></td>\n" +
                "\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/天文\" onfocus=\"blur()\" >天文</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/无人机\" onfocus=\"blur()\" >无人机</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/quora\" onfocus=\"blur()\" >QUORA</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/设计\" onfocus=\"blur()\" >设计</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/致富信息\" onfocus=\"blur()\" >致富信息</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/大丈夫\" onfocus=\"blur()\" >大丈夫</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/变性\" onfocus=\"blur()\" >变性</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/lgbt\" onfocus=\"blur()\" >LGBT</a></td>\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/nasa\" onfocus=\"blur()\" >NASA</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/3D打印\" onfocus=\"blur()\" >3D打印</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/小学堂\" onfocus=\"blur()\" >小学堂</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/广告\" onfocus=\"blur()\" >广告</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/安全警示\" onfocus=\"blur()\" >安全警示</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/笨贼\" onfocus=\"blur()\" >笨贼</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/健康\" onfocus=\"blur()\" >健康</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/重口味\" onfocus=\"blur()\" >重口味</a></td>\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/高科技\" onfocus=\"blur()\">高科技</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/数码产品\" onfocus=\"blur()\">数码产品</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/创意产品\" onfocus=\"blur()\">创意产品</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/建筑\" onfocus=\"blur()\">建筑</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/国内观光\" onfocus=\"blur()\">国内观光</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/真的猛士\" onfocus=\"blur()\" >真的猛士</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/教育\" onfocus=\"blur()\" >教育</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/何其低俗焉\" onfocus=\"blur()\" >何其低俗焉</a></td>\n" +
                "\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                <tr>\n" +
                "\t\t\t\t                <td><a href=\"/tag/环保\" onfocus=\"blur()\" >环保</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/虚拟现实\" onfocus=\"blur()\" >虚拟现实</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/whatif\" onfocus=\"blur()\">WHAT IF</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/摄影\" onfocus=\"blur()\" >摄影</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/史海钩沉\" onfocus=\"blur()\" >史海钩沉</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/正能量\" onfocus=\"blur()\" >正能量</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/旅游\" onfocus=\"blur()\" >旅游</a></td>\n" +
                "\t\t\t\t                <td><a href=\"/tag/没品笑话集\" onfocus=\"blur()\" >没品笑话集</a></td>\n" +
                "\t\t\t                </tr>\n" +
                "\t\t\t                </tbody>\n" +
                "\t\t                </table>\n" +
                "\n" +
                "\n" +
                "\t                </div>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link\" href=\"/duan\" onfocus=\"blur()\" onclick=\"ga('send', 'pageview','/header/duan');\" class=\"nav-link\">段子</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link\" href=\"/ooxx\" onfocus=\"blur()\" onclick=\"ga('send', 'pageview','/header/ooxx');\" class=\"nav-link\">妹子图</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link\" href=\"/pic\" onfocus=\"blur()\" onclick=\"ga('send', 'pageview','/header/pic');\" class=\"nav-link\">无聊图</a></li>\n" +
                "                <li class=\"nav-item\"><a class=\"nav-link\" href=\"/top\" onfocus=\"blur()\" onclick=\"ga('send', 'pageview','/header/top');\" class=\"nav-link\">热榜</a></li>\n" +
                "\n" +
                "            </ul>\n" +
                "            <div class=\"break\"></div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <!-- END header -->\n" +
                "\n" +
                "    <!-- BEGIN body -->\n" +
                "    <div id=\"body\">\n" +
                "<!-- BEGIN content -->\n" +
                "<div id=\"content\">\n" +
                "\n" +
                "\t    \t<h3 class=\"title\">走进科学</h3>\n" +
                "\t\n" +
                "\t<!-- begin post -->\n" +
                "\t\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/shitbear\">千里之外</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/19/runners-brains.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/G12O.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/19/runners-brains.html\" title=\"跑步者的脑子，跟音乐人一样灵活\" target=\"_blank\">跑步者的脑子，跟音乐人一样灵活</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/island\">island</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/19/frozen-corpses.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/ZSHQ.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/19/frozen-corpses.html\" title=\"指望未来科技救命，但人体冷冻真的可行吗？\" target=\"_blank\">指望未来科技救命，但人体冷冻真的可行吗？</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Cedric\">许叔</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/17/sticky-urine-threads.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/A9OT.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/17/sticky-urine-threads.html\" title=\"特别的捕食技巧：用尿串串粘飞虫\" target=\"_blank\">特别的捕食技巧：用尿串串粘飞虫</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/17/oldest-water.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/XITW.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/17/oldest-water.html\" title=\"世界上最古老的水，来自20亿年前\" target=\"_blank\">世界上最古老的水，来自20亿年前</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/shitbear\">千里之外</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/16/harder-than-diamond-2.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/U58T.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/16/harder-than-diamond-2.html\" title=\"比天然钻石还坚硬的「人造钻石」\" target=\"_blank\">比天然钻石还坚硬的「人造钻石」</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/yushuhuan\">小鱼儿</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/16/bits-own-body.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/K4L4.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/16/bits-own-body.html\" title=\"自然界的动物自噬现象\" target=\"_blank\">自然界的动物自噬现象</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Cedric\">许叔</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/16/asteroid-impact.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/FZJ8.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/16/asteroid-impact.html\" title=\"行星撞地球，最可怕的还不是冲击海啸\" target=\"_blank\">行星撞地球，最可怕的还不是冲击海啸</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Basilisk\">黑鳞鸡冠蛇</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/15/powerful-bite.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Z4PA.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/15/powerful-bite.html\" title=\"有超强咬合力的古哺乳动物，能捕食小恐龙\" target=\"_blank\">有超强咬合力的古哺乳动物，能捕食小恐龙</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Joan\">肌肉桃</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/14/about-big-toe.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/J00M.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/14/about-big-toe.html\" title=\"关于大脚趾，你可能不知道这些\" target=\"_blank\">关于大脚趾，你可能不知道这些</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/14/forget-your-fears.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Y2Y8.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/14/forget-your-fears.html\" title=\"为治疗恐惧症，科学家「黑」进大脑\" target=\"_blank\">为治疗恐惧症，科学家「黑」进大脑</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Basilisk\">黑鳞鸡冠蛇</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/13/sea-blob.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/VHWA.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/13/sea-blob.html\" title=\"困扰科学界百年的神秘海洋凝胶\" target=\"_blank\">困扰科学界百年的神秘海洋凝胶</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Basilisk\">黑鳞鸡冠蛇</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/13/whales-talk.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/X87R.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/13/whales-talk.html\" title=\"座头鲸会用尾巴拍打海面来进行远距离交流\" target=\"_blank\">座头鲸会用尾巴拍打海面来进行远距离交流</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/12/breathe-affects.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/OD52.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/12/breathe-affects.html\" title=\"呼吸方式是如何影响记忆的\" target=\"_blank\">呼吸方式是如何影响记忆的</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/12/get-knocked-out.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/2V36.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/12/get-knocked-out.html\" title=\"拳击手被K.O.时，大脑都发生了什么？\" target=\"_blank\">拳击手被K.O.时，大脑都发生了什么？</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Basilisk\">黑鳞鸡冠蛇</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/12/highest-plants.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/M985.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/12/highest-plants.html\" title=\"生长在海拔6150米高山的超级植物\" target=\"_blank\">生长在海拔6150米高山的超级植物</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Basilisk\">黑鳞鸡冠蛇</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/11/dragon-lizards.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/LCM5.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/11/dragon-lizards.html\" title=\"飞蜥滑翔时，会用小手抓住“翅膀”\" target=\"_blank\">飞蜥滑翔时，会用小手抓住“翅膀”</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/shitbear\">千里之外</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/11/humans-lost-tail.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/0NXH.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/11/humans-lost-tail.html\" title=\"人类为什么丢了尾巴，还丢了两次\" target=\"_blank\">人类为什么丢了尾巴，还丢了两次</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/11/earths-core.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/WSRE.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/11/earths-core.html\" title=\"地核为什么比地壳年轻两年半？\" target=\"_blank\">地核为什么比地壳年轻两年半？</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/island\">island</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/11/ants-swap.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/C1RM.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/11/ants-swap.html\" title=\"蚂蚁用分享唾液的方式来交流\" target=\"_blank\">蚂蚁用分享唾液的方式来交流</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/shitbear\">千里之外</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/11/breeding-wolves.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/XZ77.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/11/breeding-wolves.html\" title=\"藏獒这么屌，要感谢它们祖先同狼交配的勇气\" target=\"_blank\">藏獒这么屌，要感谢它们祖先同狼交配的勇气</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Quan\">Quan</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/10/apple-cider.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/I7S1.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/10/apple-cider.html\" title=\"苹果酒这么现代的饮料，其实也有漫长历史\" target=\"_blank\">苹果酒这么现代的饮料，其实也有漫长历史</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/shitbear\">千里之外</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/09/heart-stick.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/58TC.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/09/heart-stick.html\" title=\"能在关键时刻救你一命的心脏补丁\" target=\"_blank\">能在关键时刻救你一命的心脏补丁</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/09/brain-memory-2.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/XTJT.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/09/brain-memory-2.html\" title=\"为什么记不住梦？让我们研究一下海参\" target=\"_blank\">为什么记不住梦？让我们研究一下海参</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "<div>\n" +
                "<div class=\"column\"><div class=\"post\">\n" +
                "\t\t<div class=\"time_s\"><a href=\"http://jandan.net/author/Miriam\">蛋奶</a></div>\n" +
                "\t\t<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/12/09/symmetrical-brains.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/4US8.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "\t<h2 class=\"title2\"><a href=\"http://jandan.net/2016/12/09/symmetrical-brains.html\" title=\"自闭症患者的大脑竟然极其对称\" target=\"_blank\">自闭症患者的大脑竟然极其对称</a></h2>\n" +
                "\t<span class=\"break\"></span>\n" +
                "</div></div>\n" +
                "</div>\n" +
                "\n" +
                "\t\n" +
                "\t<script>\n" +
                "\t$(\"img.lazy\").each(function () {\n" +
                "\t\t$(this).lazyload({\n" +
                "\t\t\teffect: \"fadeIn\"\n" +
                "\t\t});\n" +
                "\t});\n" +
                "</script>\t<p class=\"postnav\">\n" +
                "<div class=\"wp-pagenavi\">\n" +
                "<span class=\"pages\">1 / 160</span><span class=\"current\">1</span><a href=\"http://jandan.net/tag/%E8%B5%B0%E8%BF%9B%E7%A7%91%E5%AD%A6/page/2\" title=\"2\">2</a><a href=\"http://jandan.net/tag/%E8%B5%B0%E8%BF%9B%E7%A7%91%E5%AD%A6/page/3\" title=\"3\">3</a><a href=\"http://jandan.net/tag/%E8%B5%B0%E8%BF%9B%E7%A7%91%E5%AD%A6/page/2\" >&raquo;</a></div>\n" +
                "\t</p>\n" +
                "<span id=\"nav_next\"></span><span id=\"nav_prev\"><a href=\"http://jandan.net/tag/%E8%B5%B0%E8%BF%9B%E7%A7%91%E5%AD%A6/page/2\" >&#8250;</a></span>\n" +
                "</div>\n" +
                "<!-- END content -->\n" +
                "\n" +
                "<!-- BEGIN sidebar -->\n" +
                "<div id=\"sidebar\">\n" +
                "\n" +
                "       <form action=\"https://www.so.com/s\" target=\"_blank\" id=\"cse-search-box\">\n" +
                "   <input type=\"text\" autocomplete=\"off\" name=\"q\" id=\"s\" value=\"\" placeholder=\"搜索\"></input>\n" +
                "        <button type=\"submit\" id=\"so360_submit\">Search</button>\n" +
                "        <input type=\"hidden\" name=\"ie\" value=\"utf8\">\n" +
                "        <input type=\"hidden\" name=\"src\" value=\"zz_jandan.net\">\n" +
                "        <input type=\"hidden\" name=\"site\" value=\"jandan.net\">\n" +
                "        <input type=\"hidden\" name=\"rg\" value=\"1\">\n" +
                "    </form>\n" +
                "    \n" +
                "<!-- 直投广告 -->\n" +
                "    <ul><h3>[ Sponsors ]</h3>\n" +
                "        <div ID=\"ads\">\n" +
                "            <script>\n" +
                "var str=new Array(\"1.jpg\",\"2.jpg\",\"3.jpg\",\"4.jpg\",\"5.jpg\",\"6.jpg\",\"7.jpg\");\n" +
                "var a;\n" +
                "a=str[parseInt(Math.random()*(str.length))];\n" +
                "document.write(\"<a href=\\\"//api.jandan.net/money.php?redirect_id=10\\\" target=\\\"_blank\\\" rel=\\\"external nofollow\\\"><img src=\\\"//cdn.jandan.net/static/gg/niuza/\"+a+\"\\\" border=\\\"0\\\" /></a>\");\n" +
                "</script><!-- 6-niuza -->\n" +
                "            <script>\n" +
                "var str=new Array(\"1.jpg\",\"2.jpg\",\"3.jpg\",\"4.jpg\",\"5.jpg\",\"6.jpg\");\n" +
                "var a;\n" +
                "a=str[parseInt(Math.random()*(str.length))];\n" +
                "document.write(\"<a href=\\\"//api.jandan.net/money.php?redirect_id=79\\\" target=\\\"_blank\\\" rel=\\\"external nofollow\\\"><img src=\\\"//cdn.jandan.net/static/gg/kiees/\"+a+\"\\\" border=\\\"0\\\" /></a>\");\n" +
                "</script><!-- 5-kiees -->\n" +
                "            <script>\n" +
                "var str=new Array(\"1.jpg\",\"2.jpg\",\"3.jpg\",\"4.jpg\",\"5.jpg\");\n" +
                "var a;\n" +
                "a=str[parseInt(Math.random()*(str.length))];\n" +
                "document.write(\"<a href=\\\"//api.jandan.net/money.php?redirect_id=137\\\" target=\\\"_blank\\\" rel=\\\"external nofollow\\\"><img src=\\\"//cdn.jandan.net/static/gg/tsz/\"+a+\"\\\" border=\\\"0\\\" /></a>\");\n" +
                "</script><!-- 2-TSZ-->\n" +
                "            <a href=\"//api.jandan.net/money.php?redirect_id=142\" target=\"_blank\"><img src=\"http://s.jandan.com/static/gg/ludashi.jpg\" border=\"0\" height=\"145\" width=\"145\"></a><!-- 1-G-->\n" +
                "            <a href=\"//api.jandan.net/money.php?redirect_id=75\" target=\"_blank\"><img src=\"//cdn.jandan.net/static/gg/dji4.jpg\" border=\"0\" height=\"145\" width=\"145\"></a><!-- 3-DJI-->\n" +
                "            <a href=\"//api.jandan.net/money.php?redirect_id=41\" target=\"_blank\"><img src=\"http://s.jandan.com/static/gg/g2.png\" border=\"0\" height=\"145\" width=\"145\"></a><!-- 4-room301-->\n" +
                "        </div>\n" +
                "        <div id=\"random-ads\" class=\"xy\" style=\"display:none;\"></div>\n" +
                "    </ul>\n" +
                "\n" +
                "<!-- 首页 -->\n" +
                "\n" +
                "\n" +
                "<!-- 中部广告 -->\n" +
                "            <ul ID=\"adsense\"><!-- 300-baidu[1] -->\n" +
                "            <script type=\"text/javascript\">\n" +
                "    /*300*250[1]*/\n" +
                "    var cpro_id = \"u520738\";\n" +
                "</script>\n" +
                "<script src=\"https://cpro.baidustatic.com/cpro/ui/c.js\" type=\"text/javascript\"></script>        </ul>\n" +
                "    \n" +
                "<!-- 热文榜 -->\n" +
                "    <div class=\"hot-list\">\n" +
                "        <ul class=\"hot-tabs\">\n" +
                "            <li id=\"tab-hotposts\" class=\"current\">24H热文</li>\n" +
                "            <li id=\"tab-hotlike\">三日最赞</li>\n" +
                "            <li id=\"tab-hotcomments\">一周话题</li>\n" +
                "            <div class=\"break\"></div>\n" +
                "        </ul>\n" +
                "        <div class=\"host-list-split\"></div>\n" +
                "        <div class=\"hot-list-item hot-list-item-current\" id=\"list-hotposts\">\n" +
                "            <!-- 日点击排行 -->\n" +
                "            <ol>\n" +
                "\t\t<script>\n" +
                "\t\tdocument.write(decodeURIComponent('%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fsun-slowing-down.html%22%20title%3D%2221273%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E7%A7%91%E5%AD%A6%E5%AE%B6%E7%BB%88%E4%BA%8E%E7%9F%A5%E9%81%93%E5%A4%AA%E9%98%B3%E4%B8%BA%E4%BB%80%E4%B9%88%E8%BD%AC%E5%BE%97%E8%B6%8A%E6%9D%A5%E8%B6%8A%E6%85%A2%E4%BA%86%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fromantic-scenarios-gross.html%22%20title%3D%2216987%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E8%BF%99%E4%BA%9B%E6%97%A5%E6%9C%AC%E5%8A%A8%E6%BC%AB%E5%A5%97%E8%B7%AF%EF%BC%8C%E5%9C%A8%E7%8E%B0%E5%AE%9E%E4%B8%AD%E4%BC%9A%E5%BE%88%E6%81%B6%E5%BF%83%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fsick-4chan-41.html%22%20title%3D%2215587%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E6%B2%A1%E5%93%81%2B4chan%E7%AC%91%E8%AF%9D%E9%9B%86%EF%BC%9A%E4%B8%87%E4%B8%80%E5%9C%A8%E8%8F%8A%E8%8A%B1%E4%B8%8A%E6%9C%89%E3%80%87%E6%B6%B2%E6%97%B6%E6%AD%BB%E4%BA%86%E2%80%A6%E2%80%A6%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F19%2Fposition-for-micropenis.html%22%20title%3D%2214595%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E9%80%82%E5%90%88%E5%BE%AE%E5%9E%8B%E9%93%85%E7%AC%94%E7%9A%845%E7%A7%8D%E4%BD%93%E4%BD%8D%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fhahahaha-9.html%22%20title%3D%2214157%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E6%97%A0%E8%81%8A%E5%9B%BE%E5%A4%A7%E5%90%90%E6%A7%BD%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fthe-hunger-games.html%22%20title%3D%225601%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E4%BF%84%E7%BD%97%E6%96%AF%E5%B0%86%E5%9C%A8%E8%A5%BF%E4%BC%AF%E5%88%A9%E4%BA%9A%E4%B8%BE%E8%A1%8C%E7%9C%9F%E6%AD%A3%E7%9A%84%E9%A5%A5%E9%A5%BF%E6%B8%B8%E6%88%8F%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Ffactors-beauty.html%22%20title%3D%225263%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E7%9C%8B%E8%B5%B7%E6%9D%A5%E6%9B%B4%E5%83%8F%E5%88%91%E5%85%B7%E7%9A%84%E5%8F%A4%E8%91%A3%E7%BE%8E%E5%AE%B9%E4%BB%AA%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fthe-toda-people.html%22%20title%3D%224483%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E5%8D%B0%E5%BA%A6%E9%83%A8%E8%90%BD%EF%BC%9A%E6%89%98%E8%BE%BE%E4%BA%BA%E7%9A%84%E6%9C%89%E8%B6%A3%E4%B9%A0%E4%BF%97%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F19%2Fpie-into-space.html%22%20title%3D%223285%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E8%8B%B1%E5%9B%BD%E7%A7%91%E5%AD%A6%E5%AE%B6%E4%B8%80%E5%9D%97%E9%A6%85%E9%A5%BC%E9%80%81%E4%B8%8A%E5%A4%A9%3C%2Fa%3E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F19%2Ffrozen-corpses.html%22%20title%3D%222496%E6%AC%A1%E6%B5%8F%E8%A7%88%22%3E%E6%8C%87%E6%9C%9B%E6%9C%AA%E6%9D%A5%E7%A7%91%E6%8A%80%E6%95%91%E5%91%BD%EF%BC%8C%E4%BD%86%E4%BA%BA%E4%BD%93%E5%86%B7%E5%86%BB%E7%9C%9F%E7%9A%84%E5%8F%AF%E8%A1%8C%E5%90%97%EF%BC%9F%3C%2Fa%3E%3C%2Fli%3E'));\n" +
                "\t</script>\n" +
                "</ol>\n" +
                "        </div>\n" +
                "        <div class=\"hot-list-item\" id=\"list-hotlike\">\n" +
                "            <!-- 日最赞排行 -->\n" +
                "            <ol>\n" +
                "\t\t<script>\n" +
                "\t\tdocument.write(decodeURIComponent('%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F16%2Fanime-style-illustrated.html%22%3E%E6%97%A5%E6%9C%AC%E5%A5%87%E4%B9%A6%EF%BC%9A%E6%89%8B%E6%8A%8A%E6%89%8B%E6%95%99%E4%BD%A0%E8%84%B1%E5%A7%91%E5%A8%98%E7%9A%84%E8%A1%A3%E6%9C%8D%3C%2Fa%3E%20%2079%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fhahahaha-9.html%22%3E%E6%97%A0%E8%81%8A%E5%9B%BE%E5%A4%A7%E5%90%90%E6%A7%BD%3C%2Fa%3E%20%2061%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fsick-4chan-41.html%22%3E%E6%B2%A1%E5%93%81%2B4chan%E7%AC%91%E8%AF%9D%E9%9B%86%EF%BC%9A%E4%B8%87%E4%B8%80%E5%9C%A8%E8%8F%8A%E8%8A%B1%E4%B8%8A%E6%9C%89%E3%80%87%E6%B6%B2%E6%97%B6%E6%AD%BB%E4%BA%86%E2%80%A6%E2%80%A6%3C%2Fa%3E%20%2045%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fthe-hunger-games.html%22%3E%E4%BF%84%E7%BD%97%E6%96%AF%E5%B0%86%E5%9C%A8%E8%A5%BF%E4%BC%AF%E5%88%A9%E4%BA%9A%E4%B8%BE%E8%A1%8C%E7%9C%9F%E6%AD%A3%E7%9A%84%E9%A5%A5%E9%A5%BF%E6%B8%B8%E6%88%8F%3C%2Fa%3E%20%2035%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F17%2Fi-spent-it.html%22%3E%E9%93%B6%E8%A1%8C%E7%BB%99%E6%88%91%E8%B4%A6%E6%88%B7%E5%BC%80%E6%8C%82%E4%BA%86%EF%BC%8C%E4%BA%8E%E6%98%AF%E6%88%91%E5%B0%B1%E5%AB%96%E5%A6%93%E5%90%B8%E6%AF%92%3C%2Fa%3E%20%2034%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F17%2Fsurreal-caves-6.html%22%3E%E5%9C%B0%E7%90%83%E4%B8%8A%E6%9C%80%E7%A6%BB%E5%A5%87%E7%9A%84%E5%85%AD%E4%B8%AA%E6%B4%9E%E7%A9%B4%3C%2Fa%3E%20%2031%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F18%2Fvirus-bacteria.html%22%3E%E5%8F%B2%E6%B5%B7%E9%92%A9%E6%B2%89%EF%BC%9A%E4%BC%9F%E5%A4%A7%E7%9A%84%E5%99%AC%E8%8F%8C%E4%BD%93%E7%96%97%E6%B3%95%3C%2Fa%3E%20%2028%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F17%2Fmulticolored-cats.html%22%3E%E5%96%B5%E6%98%9F%E4%BA%BA%EF%BC%9A%E6%AF%9B%E8%89%B2%E8%B6%8A%E6%9D%82%EF%BC%8C%E8%84%BE%E6%B0%94%E8%B6%8A%E5%B7%AE%3C%2Fa%3E%20%2027%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F16%2Fcreepiest-thing-3.html%22%3E%5BQuora%5D%20%E6%9C%80%E4%BB%A4%E4%BA%BA%E6%AF%9B%E9%AA%A8%E6%82%9A%E7%84%B6%E7%9A%84%E4%BA%8B%3C%2Fa%3E%20%2023%E8%B5%9E%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F16%2Fkites-history.html%22%3E%E9%A3%8E%E7%AD%9D%E5%BC%82%E5%8F%B2%EF%BC%9A%E6%9B%BE%E7%94%A8%E4%BA%8E%E5%A4%84%E6%AD%BB%E7%8A%AF%E4%BA%BA%3C%2Fa%3E%20%2018%E8%B5%9E%3C%2Fli%3E'));\n" +
                "\t</script>\n" +
                "</ol>\n" +
                "\t        </div>\n" +
                "        <div class=\"hot-list-item\" id=\"list-hotcomments\">\n" +
                "            <!-- 周评论排行 -->\n" +
                "            <ol>\n" +
                "\t\t<script>\n" +
                "\t\tdocument.write(decodeURIComponent('%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F13%2Fevaporating-people.html%22%3E%E6%97%A5%E6%9C%AC%E5%BC%82%E9%97%BB%E5%BD%95%EF%BC%9A%E7%AA%81%E7%84%B6%E6%B6%88%E5%A4%B1%E7%9A%84%E4%BA%BA%3C%2Fa%3E%20%2064%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F14%2Fmeet-av-stars.html%22%3E%E5%9C%A8%E6%97%A5%E6%9C%AC%EF%BC%9A%E6%80%8E%E6%A0%B7%E6%89%8D%E8%83%BD%E8%A7%81%E5%88%B0%E6%97%A5%E6%9C%AC%E5%A5%B3%E4%BC%98%3C%2Fa%3E%20%2060%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F13%2Fsex-with-dog-2.html%22%3E%E8%80%81%E4%B8%8D%E7%BE%9E%EF%BC%9A%E8%8B%B1%E5%9B%BD%E8%80%81%E5%A4%AA%E4%B8%8E%E7%8B%97%E4%BA%A4%E5%90%88%EF%BC%8C%E8%A2%AB%E8%B5%B7%E8%AF%89%3C%2Fa%3E%20%2059%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F15%2Fwoman-flies-world.html%22%3E%E5%8F%88%E6%9C%89%E7%BE%8E%E5%A5%B3%E7%94%A8%E7%BA%A6%E5%9C%9F%E8%B1%AA%E7%9A%84%E6%96%B9%E5%BC%8F%E6%9D%A5%E5%91%A8%E6%B8%B8%E4%B8%96%E7%95%8C%E4%BA%86%3C%2Fa%3E%20%2059%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F15%2Fpenis-bone-humans.html%22%3E%E4%BA%BA%E7%B1%BB%E4%B9%8B%E6%89%80%E4%BB%A5%E6%B2%A1%E6%9C%89%E9%98%B4%E8%8C%8E%E9%AA%A8%EF%BC%8C%E6%98%AF%E5%9B%A0%E4%B8%BA%E4%BD%A0%E7%9A%84%E2%80%A6%E5%A4%AA%E7%9F%AD%3C%2Fa%3E%20%2059%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F12%2Fchickens-fly.html%22%3E%E5%A4%A7%E5%AE%B6%E9%83%BD%E6%98%AF%E9%B8%9F%EF%BC%8C%E4%B8%BA%E4%BB%80%E4%B9%88%E9%B8%A1%E7%9A%84%E9%A3%9E%E8%A1%8C%E8%83%BD%E5%8A%9B%E8%BF%99%E4%B9%88%E5%BC%B1%EF%BC%9F%3C%2Fa%3E%20%2052%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F13%2Fseeing-boobs.html%22%3E%E5%AE%85%E7%94%B7%E8%AE%BF%E8%B0%88%E5%BD%95%EF%BC%9A%E7%AC%AC%E4%B8%80%E6%AC%A1%E8%A7%81%E5%88%B0%E5%A5%B6%E5%AD%90%3C%2Fa%3E%20%2051%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F13%2Fmost-influential-scientist.html%22%3E%E5%85%A8%E8%83%BD%E7%A7%91%E5%AD%A6%E5%AE%B6%EF%BC%8C%E5%BC%80%E6%8C%82%E7%9A%84%E6%B4%AA%E5%A0%A1%3C%2Fa%3E%20%2051%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F13%2Fexotic-massage-bangkok.html%22%3E%E6%9B%BC%E8%B0%B7%E6%8C%89%E6%91%A9%E8%80%83%EF%BC%9A%E4%BC%A0%E8%AF%B4%E4%B8%AD%E7%9A%84%E6%B3%B0%E5%BC%8F%E5%A4%A7%E4%BF%9D%E5%81%A5%3C%2Fa%3E%20%2050%E8%AF%84%E8%AE%BA%3C%2Fli%3E%3Cli%3E%3Ca%20href%3D%22http%3A%2F%2Fjandan.net%2F2016%2F12%2F14%2Fslicing-a-jamon.html%22%3E%E5%88%87%E4%B8%80%E6%9D%A1%E8%A5%BF%E7%8F%AD%E7%89%99%E7%81%AB%E8%85%BF%EF%BC%8C%E6%94%B6%E8%B4%B9%E5%9B%9B%E5%8D%83%E7%BE%8E%E5%85%83%3C%2Fa%3E%20%2049%E8%AF%84%E8%AE%BA%3C%2Fli%3E'));\n" +
                "\t</script>\n" +
                "</ol>\n" +
                "\t        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "<!-- 插入优评 -->\n" +
                "        \n" +
                "<!-- 底部广告 -->\n" +
                "            <div id=\"box\">\n" +
                "            <div id=\"float\" class=\"box\">\n" +
                "                <ul ID=\"adsense\"><!-- 300-baidu -->\n" +
                "                    <script type=\"text/javascript\">\n" +
                "    /*300*250*/\n" +
                "    var cpro_id = \"u608784\";\n" +
                "</script>\n" +
                "<script src=\"https://cpro.baidustatic.com/cpro/ui/c.js\" type=\"text/javascript\"></script>                </ul>\n" +
                "                <ul ID=\"adsense\"><!-- 300-taobao -->\n" +
                "                    <script type=\"text/javascript\">\n" +
                "     document.write('<a style=\"display:none!important\" id=\"tanx-a-mm_10008550_105090_10650815\"></a>');\n" +
                "     tanx_s = document.createElement(\"script\");\n" +
                "     tanx_s.type = \"text/javascript\";\n" +
                "     tanx_s.charset = \"gbk\";\n" +
                "     tanx_s.id = \"tanx-s-mm_10008550_105090_10650815\";\n" +
                "     tanx_s.async = true;\n" +
                "     tanx_s.src = \"https://p.tanx.com/ex?i=mm_10008550_105090_10650815\";\n" +
                "     tanx_h = document.getElementsByTagName(\"head\")[0];\n" +
                "     if(tanx_h)tanx_h.insertBefore(tanx_s,tanx_h.firstChild);\n" +
                "</script>                </ul>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    \n" +
                "\n" +
                "    <!-- random-ad JS -->\n" +
                "    <script>\n" +
                "        (function () {\n" +
                "            var source = document.getElementById(\"ads\");\n" +
                "            var target = document.getElementById(\"random-ads\");\n" +
                "            var ads = source.getElementsByTagName(\"a\");\n" +
                "            var arr = [];\n" +
                "            for (var i = 0; i < ads.length; i++) {\n" +
                "                arr[i] = i;\n" +
                "            }\n" +
                "\n" +
                "            function randomSort(d, c) {\n" +
                "                var e = parseInt((Math.random() + 0.5), 10);\n" +
                "                return e ? d - c : c - d;\n" +
                "            }\n" +
                "\n" +
                "            arr.sort(randomSort);\n" +
                "            for (var i = 0; i < arr.length; i++) {\n" +
                "                target.appendChild(ads[arr[i]].cloneNode(true));\n" +
                "            }\n" +
                "            source.parentNode.removeChild(source);\n" +
                "            target.style.display = \"block\";\n" +
                "        })();\n" +
                "    </script>\n" +
                "\n" +
                "    <!-- hot-tabs JS -->\n" +
                "    <script>\n" +
                "    (function($) {\n" +
                "        function add_show_more() {\n" +
                "            var $this = $(this);\n" +
                "            var pHeight = 0;\n" +
                "            $this.find('p').each(function () {\n" +
                "                pHeight += $(this).height();\n" +
                "            });\n" +
                "            if (pHeight > $this.height()) {\n" +
                "                var show_more = $this.find('.show_more');\n" +
                "                if (show_more.length == 0) {\n" +
                "                    $this.append('<div class=\"show_more\"> &DownTeeArrow;  展开</div>')\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        $('.hot-tabs li').click(function () {\n" +
                "            var tab = this.id.split('-')[1];\n" +
                "            var parent = $(this).parent();\n" +
                "            parent.find('li').removeClass('current');\n" +
                "            parent.parent().find('.hot-list-item').removeClass('hot-list-item-current');\n" +
                "            $(this).addClass('current');\n" +
                "            var list_tab = $('#list-' + tab);\n" +
                "            list_tab.addClass('hot-list-item-current');\n" +
                "            list_tab.find('.acv_comment').each(add_show_more);\n" +
                "            list_tab.find('.gif-mask').each(function () {\n" +
                "                var $this = $(this);\n" +
                "                if ($this.height() > 0) {\n" +
                "                    return;\n" +
                "                }\n" +
                "                $this.parent().css('position', 'relative');\n" +
                "                var img = $this.prev();\n" +
                "                var position = img.position();\n" +
                "                $this.css({\n" +
                "                    'height': img.height(),\n" +
                "                    'width': img.width(),\n" +
                "                    'line-height': img.height() + 'px',\n" +
                "                    'left': position.left,\n" +
                "                    'top': position.top\n" +
                "                });\n" +
                "            });\n" +
                "        });\n" +
                "        $(window).load(function () {\n" +
                "            $('.acv_comment').click(function () {\n" +
                "                var $this = $(this);\n" +
                "                var show_more = $this.find('.show_more');\n" +
                "                if (show_more.length == 0) {\n" +
                "                    return;\n" +
                "                }\n" +
                "                if (!$this.hasClass('acv_comment_full_size')) {\n" +
                "                    $this.addClass('acv_comment_full_size');\n" +
                "                    show_more.html(' &UpTeeArrow; 收起');\n" +
                "                } else {\n" +
                "                    $this.removeClass('acv_comment_full_size');\n" +
                "                    show_more.html(' &DownTeeArrow; 展开');\n" +
                "                }\n" +
                "            }).each(add_show_more);\n" +
                "        });\n" +
                "    })($);\n" +
                "</script>\n" +
                "    <!-- END sidebar -->\n" +
                "\n" +
                "    <div class=\"break\"></div>\n" +
                "</div>\n" +
                "<!-- END body -->\n" +
                "<!-- BEGIN footer -->\n" +
                "</div>\n" +
                "<a id=\"nav_top\" style=\"cursor:pointer;\" title=\"回到页头\"><span>&#9650;</span></a>\n" +
                "<div id=\"footer\">\n" +
                "\t\t\t&copy; 2006-2016. 煎蛋，每天更新鲜</a>\n" +
                "\t</div>\n" +
                "<!-- END footer -->\n" +
                "<!-- BEGIN JS -->\n" +
                "\n" +
                "\n" +
                "<script>\n" +
                "  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
                "  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
                "  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
                "  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
                "  ga('create', 'UA-462921-3', 'auto');\n" +
                "  ga('send', 'pageview');\n" +
                "</script>\n" +
                "<script>\n" +
                "var _hmt = _hmt || [];\n" +
                "(function() {\n" +
                "  var hm = document.createElement(\"script\");\n" +
                "  hm.src = \"//hm.baidu.com/hm.js?fd93b7fb546adcfbcf80c4fc2b54da2c\";\n" +
                "  var s = document.getElementsByTagName(\"script\")[0]; \n" +
                "  s.parentNode.insertBefore(hm, s);\n" +
                "})();\n" +
                "</script>\n" +
                "\n" +
                "<!-- END JS -->\n" +
                "\n" +
                "</div>\n" +
                "<!-- END wrapper -->\n" +
                "</body>\n" +
                "</html>\n");
        String[] strings=html.split("\n");
        int counter=0;
        for (String string : strings) {
            if (string.contains("data-original")) {
                String link = string.substring(string.indexOf("trankr"),string.indexOf("jpg")+3);
                System.out.println(link);
                counter++;

            }
        }
        System.out.println(counter);
    }
}
