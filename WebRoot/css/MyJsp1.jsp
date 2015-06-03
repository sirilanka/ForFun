
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js"></script>
	<script>
		function addTab(title, url){
			if ($('#graphNews').tabs('exists', title)){
				$('#graphNews').tabs('select', title);
			} else {
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
				$('#graphNews').tabs('add',{
					title:title,
					content:content,
					closable:true
				});
			}
		}
	</script>
</head>
<body>
	<div style="margin-bottom:10px">
		<a href="#" class="easyui-linkbutton" onclick="addTab('google','http://www.google.com')">google</a>
		<a href="#" class="easyui-linkbutton" onclick="addTab('jquery','http://jquery.com/')">jquery</a>
		<a href="#" class="easyui-linkbutton" onclick="addTab('easyui','http://jeasyui.com/')">easyui</a>
	</div>
	<div id="graphNews" class="easyui-tabs" style="width:400px;height:250px;">
		<div title="Home">
		</div>
		<div title="nihao">
		</div>
	</div>
</body>
</html>