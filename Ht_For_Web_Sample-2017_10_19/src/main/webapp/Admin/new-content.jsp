<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%-- <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	out.println("path-->"+ path);
%> --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>添加新闻</title>
 <link rel="stylesheet" type="text/css" href="${root}/Admin/static/h-ui/css/H-ui.min.css" />
 <link rel="stylesheet" type="text/css" href="${root}/Admin/static/h-ui.admin/css/H-ui.admin.css" />
 <link rel="stylesheet" type="text/css" href="${root}/Admin/lib/Hui-iconfont/1.0.7/iconfont.css" />
 <link rel="stylesheet" type="text/css" href="${root }/Admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
 <link rel="stylesheet" type="text/css" href="${root }/Admin/static/h-ui.admin/css/style.css" />
 <link rel="stylesheet" type="text/css" href="${root}/Admin/ueditor/themes/default/css/ueditor.css" />
 </head>
 <body>
 <article class="page-container">
	<form method="post" class="form form-horizontal" id="form-testpaper-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>新闻标题：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${requestScope.news.newTitle}" placeholder="" id="newTitle" maxlength="60">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>新闻作者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${requestScope.news.author}" placeholder="" id="author" maxlength="30">
			</div>
		</div>
		<div class="row cl" id="content">
				<label class="form-label col-xs-4 col-sm-2">新闻内容：</label>
				<div class="formControls col-xs-8 col-sm-9"> 
					<script id="editor" type="text/plain" style="width:100%;height:500px;"></script> 
				</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button class="btn btn-primary radius" type="button" id="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
			</div>
		</div>
	</form>
</article>
 <script type="text/javascript" src="${root}/Admin/ueditor/ueditor.config.js"></script>
 <script type="text/javascript" src="${root}/Admin/ueditor/ueditor.all.js"></script>
 <script type="text/javascript" src="${root}/Admin/ueditor/lang/zh-cn/zh-cn.js"></script>
 <script type="text/javascript" src="${root}/Admin/lib/jquery/1.9.1/jquery.js"></script>
 <script type="text/javascript" src="${root}/Admin/lib/layer/2.1/layer.js"></script>
 <script type="text/javascript">
/* $(document).ready(function(){
	alert("newId-->" + ${param.newId} );
	getNews(${param.newId});
});
 */
function getNews(newId){
	
	$.ajax({
		type:'post',
		url: '${root}/new/getNew',
		data:{newId: '${param.newId}'},
		contentType:'json',
		success:function(data){
			alert(JSON.stringify(data));
		}
	});
}

function isnull(val){
	var str = val.replace(/(^\s*)|(\s*$)/g, '');//去除空格;

    if (str == '' || str == undefined || str == null) {
    	console.log('空')
        return true;
    } else {
    	console.log('非空');
        return false;
    }
}
$(function(){
	
	$(function(){
		var ue = UE.getEditor('editor');
	})
	
	$("#submit").click(function(){
		var isEmpty = isnull($("#newTitle").val());
		//新闻标题不能为空
		if(isEmpty){
			layer.msg('新闻标题不能为空,请重新输入!',{icon: 4,time:1000});
			return;
		}
		//新闻内容不能为空
		if(!UE.getEditor('editor').hasContents()){
			layer.msg('新闻内容不能为空,请编辑您的新闻',{icon: 4,time:1000});
			return;
		}
		
	    $.ajax({
			url: '${root}/new/addNew',
			type:'post',
			data:{
				author: $("#author").val(),
				newTitle: $("#newTitle").val(),
				myContent: UE.getEditor('editor').getContent()
			},
			dataType:'text',
			contentType:'application/x-www-form-urlencoded',
			traditional: true,
	        timeout:5000,
	        async:false,
	        success: function (data) {
        		if(data){
        			window.location.href="${root}/Admin/new-list.jsp";
        		}else{
        			layer.msg('添加发生错误!',{icon: 2,time:1000});
        		}
	        },
       		error: function (XMLHttpRequest, textStatus, errorThrown) {
   	      	   layer.msg("ajax提交时错误" + textStatus + "信息：" + errorThrown,{icon: 2,time:1000});
   	        }
		});
	});
	
})
 </script>
 </body>
</html>