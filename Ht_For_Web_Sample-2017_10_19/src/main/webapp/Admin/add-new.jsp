<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>添加新闻</title>
 <script type="text/javascript" src="./ueditor/ueditor.config.js"></script>
 <script type="text/javascript" src="./ueditor/ueditor.all.js"></script>
 <link rel="stylesheet" type="text/css" href="./udeditor/themes/default/css" />
 <!-- <script type="text/javascript" charset="utf-8" src="./lang/zh-cn/zh-cn.js"></script> -->
 
 </head>
 <body>
    <div style="margin:50px 0 0 10%; padding-bottom:30px;"><span>新闻标题  </span><input type="text" name="headtitle" style="width:40%;line-height:24px;margin-left:1%;"></div>
 	<div>
 		<script id="editor" type="text/plain" style="width:90%;height:400px;margin-left:10%;padding-bottom:40px;"></script>
    </div>
 	<div style="margin-left:40%;padding-bottom:30px;"><button type="submit" value="发布新闻">发布新闻</button> </div>
    <script type="text/javascript">
 	var ue = UE.getEditor('editor');
 	// var content = UE.getPlainTxt();//content就是编辑器的带格式的内容
	 //focus时自动清空初始化时的内容
 </script>
 </body>
</html>