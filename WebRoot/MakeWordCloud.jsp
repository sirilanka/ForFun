<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String newsId = request.getParameter("newsId");
String strUrl = "width=900,height=600,top=50,left=800,toolbar=50,menubar=no,scrollbars=yes, resizable=yes,location=yes, status=yes";
%>
<!DOCTYPE html>
<html>
  <head>
    <title>jQCloud Example</title>
    <link rel="stylesheet" type="text/css" href="jqcloud/jqcloud1.css" />
    <script src="js/jquery-1.5.2.min.js"></script>
    <script type="text/javascript" src="jqcloud/jqcloud-1.0.4.js"></script>
   
   
	
	
	
   <!-- 词云 {text: "Ipsum", weight: 10.5, html: {title: "My Title", "class": "custom-class"}, link: {href: "http://jquery.com/", target: "_blank"}},
   {text:"方正证券",weight:8,handlers:{click: function() { alert("it works!"); } }},
   {text:"方正证券",weight:8,handlers:{click: function() { myWindow=window.open('http://www.baidu.com/s?word=政泉控股','','width=600,height=600,top=50,left=800,toolbar=50,menubar=no,scrollbars=yes, resizable=yes,location=yes, status=yes'); } }},
    {text:"北大方正",weight:2,link: {href: "<%=path %>/stock.jsp?newsId=1",target: "_blank", title: "A link"}},  					
  	“城市词频”[{text:"﻿马累",weight:172},{text:"三亚",weight:116},{text:"巴厘岛",weight:78},{text:"普吉岛",weight:53},{text:"巴黎",weight:33},{text:"雅典",weight:28},{text:"罗马",weight:26},{text:"丽江",weight:26},{text:"路易港",weight:25},{text:"威尼斯",weight:23},{text:"米兰",weight:20},{text:"佛罗伦萨",weight:19},{text:"卢塞恩",weight:19},{text:"昆明",weight:19},{text:"鹿岛市",weight:18},{text:"香港",weight:17},{text:"大理",weight:16},{text:"吉隆坡",weight:16},{text:"厦门",weight:15},{text:"迪拜",weight:15},{text:"香格里拉",weight:15},{text:"曼谷",weight:14},{text:"台湾",weight:12},{text:"上海",weight:12},{text:"因特拉肯",weight:11},{text:"夏威夷",weight:11},{text:"清迈",weight:11},{text:"大阪",weight:10},{text:"阳朔",weight:10},];
  	[{text:"﻿亚龙湾",weight:85},{text:"蜈支洲岛",weight:72},{text:"三亚湾",weight:63},{text:"大东海",weight:62},{text:"乌布",weight:49},{text:"天涯海角",weight:48},{text:"海神庙",weight:41},{text:"库塔海滩",weight:41},{text:"金巴兰海滩",weight:31},{text:"南田温泉",weight:28},{text:"圣托里尼岛",weight:25},{text:"椰梦长廊",weight:25},{text:"乌布皇宫",weight:25},{text:"芭东海滩",weight:24},{text:"美茹岛",weight:24},{text:"皇帝岛",weight:24},{text:"海棠湾",weight:23},{text:"蓝梦岛",weight:22},{text:"大小洞天",weight:22},{text:"卡尼岛",weight:21},{text:"阿雅达岛",weight:20},{text:"卢浮宫",weight:20},{text:"七色土",weight:20},{text:"红顶教堂",weight:20},{text:"乌鲁瓦图",weight:19},{text:"泸沽湖",weight:18},{text:"蓝点教堂",weight:18},{text:"西岛",weight:17},{text:"皮皮岛",weight:17},{text:"宪法广场",weight:17},{text:"圣泉寺",weight:17},{text:"埃菲尔铁塔",weight:17},{text:"莉莉岛",weight:16},{text:"凯旋门",weight:16},{text:"鼓浪屿",weight:14},{text:"登巴萨",weight:14},{text:"南湾",weight:14},{text:"古罗马斗兽场",weight:13},{text:"巴黎圣母院",weight:12},{text:"玉龙雪山",weight:12},{text:"京打马尼",weight:11},{text:"蓝顶教堂",weight:11},{text:"波杜希蒂岛",weight:11},{text:"塞班岛",weight:10},{text:"卡塔海滩",weight:10},{text:"努沙杜瓦",weight:10},{text:"伊露岛",weight:10},{text:"凡尔赛宫",weight:10},{text:"红沙滩",weight:10},];
  	“国家词频”[{text:"﻿马尔代夫",weight:248},{text:"中国",weight:237},{text:"印度尼西亚",weight:77},{text:"泰国",weight:76},{text:"毛里求斯",weight:50},{text:"法国",weight:47},{text:"希腊",weight:34},{text:"意大利",weight:33},{text:"美国",weight:28},{text:"马来西亚",weight:23},{text:"瑞士",weight:23},{text:"日本",weight:19},{text:"阿联酋",weight:18},{text:"梵蒂冈",weight:17},{text:"英国",weight:14},{text:"新西兰",weight:12},];
  	“景点词频”[{text:"﻿亚龙湾",weight:85},{text:"蜈支洲岛",weight:72},{text:"三亚湾",weight:63},{text:"大东海",weight:62},{text:"乌布",weight:49},{text:"天涯海角",weight:48},{text:"库塔海滩",weight:41},{text:"金巴兰海滩",weight:31},{text:"南田温泉",weight:28},{text:"圣托里尼岛",weight:25},{text:"芭东海滩",weight:24},{text:"皇帝岛",weight:24},{text:"美茹岛",weight:24},{text:"海棠湾",weight:23},{text:"蓝梦岛",weight:22},{text:"大小洞天",weight:22},{text:"卡尼岛",weight:21},{text:"阿雅达岛",weight:20},{text:"泸沽湖",weight:18},{text:"皮皮岛",weight:17},{text:"莉莉岛",weight:16},{text:"鼓浪屿",weight:14},{text:"登巴萨",weight:14},{text:"玉龙雪山",weight:12},{text:"波杜希蒂岛",weight:11},{text:"塞班岛",weight:10},{text:"卡塔海滩",weight:10},{text:"努沙杜瓦",weight:10},{text:"伊露岛",weight:10},];
      
   -->
    <script type="text/javascript">
    $(document).ready(function(){
    	
      var word_list = [{text:"﻿马尔代夫",weight:248},{text:"中国",weight:237},{text:"印度尼西亚",weight:77},{text:"泰国",weight:76},{text:"毛里求斯",weight:50},{text:"法国",weight:47},{text:"希腊",weight:34},{text:"意大利",weight:33},{text:"美国",weight:28},{text:"马来西亚",weight:23},{text:"瑞士",weight:23},{text:"日本",weight:19},{text:"阿联酋",weight:18},{text:"梵蒂冈",weight:17},{text:"英国",weight:14},{text:"新西兰",weight:12},];
  	
   		 var com_list  = [{text:"﻿马累",weight:172},{text:"三亚",weight:116},{text:"巴厘岛",weight:78},{text:"普吉岛",weight:53},{text:"巴黎",weight:33},{text:"雅典",weight:28},{text:"罗马",weight:26},{text:"丽江",weight:26},{text:"路易港",weight:25},{text:"威尼斯",weight:23},{text:"米兰",weight:20},{text:"佛罗伦萨",weight:19},{text:"卢塞恩",weight:19},{text:"昆明",weight:19},{text:"鹿岛市",weight:18},{text:"香港",weight:17},{text:"大理",weight:16},{text:"吉隆坡",weight:16},{text:"厦门",weight:15},{text:"迪拜",weight:15},{text:"香格里拉",weight:15},{text:"曼谷",weight:14},{text:"台湾",weight:12},{text:"上海",weight:12},{text:"因特拉肯",weight:11},{text:"夏威夷",weight:11},{text:"清迈",weight:11},{text:"大阪",weight:10},{text:"阳朔",weight:10},];
      $(function() {
        $("#latin_words").jQCloud(word_list, {
				  width: 600,
				  height: 400
				  
				});
        $("#comWord").jQCloud(com_list, {
				  width: 600,
				  height: 400
				},{delayedMode:true
			},{shape: "rectangular"});
      });
      
      }); 
    </script>

  </head>
  <body>
  	<div id="title">
	  	<input id="newsId1" style="display: none;"  value = "<%=newsId %>">
	  	<input id="hotword1" style="display: none;"  value = "1">
 	 </div>
  	<div style="float:left;">
	    <h1 align="center">股票热词</h1>
	    
	    <div id="latin_words" bgcolor="#90c5f0" style="float:left;width: 500px; height: 300px;margin:20px; border: 7px solid #ccc;">
	    	<font style="float:right;" onclick="alert('fuck')">更多热词</font>
	    </div>
	    	
    </div>
   
    <div style="float:right;">
    	<h1 align="center" >关键词热词</h1>
   		<div id="comWord"  style="float:right;width: 600px; height: 400px;margin:20px; border: 7px solid #ccc;"></div>
   		
    </div>
	
    
  </body>
</html>
