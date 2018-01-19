<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="Admin/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="Admin/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="Admin/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="Admin/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="Admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="Admin/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>上传方案</title>
</head>
<body>
<article class="page-container">
	
	<form action="<%=basePath%>planAdmin/planAdd" method="post" class="form form-horizontal" id="form-member-add" enctype="multipart/form-data">
	 	  <div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>作者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" datatype="" class="input-text" value="" placeholder="" id="author" name="author" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>方案名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" datatype="" class="input-text" value="" placeholder="" id="planName" name="planName" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>层数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" datatype="s" class="input-text" value="" placeholder="" id="floor" name="floor" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>建筑面积：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="area" name="area" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>建筑面积长：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="areaLength" name="areaLength" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>建筑面积宽：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder="" id="areaWidth" name="areaWidth" required>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">屋面形式：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" name="roofStyle">
					<option value="1" selected>平屋面</option>
					<option value="2">双坡面</option>
					<option value="3">四坡面</option>
				</select>
				</span> 
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">建筑风格：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" name="planStyle">
					<option value="1" selected>甬派风格</option>
					<option value="2">传统风格</option>
					<option value="3">现代风格</option>
				</select>
				</span> 
			</div>
		</div> 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">立面材质：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" name="elevaStyle">
					<option value="1" selected>抹灰外墙面</option>
					<option value="2">涂料外墙面</option>
					<option value="3">饰面砖外墙面</option>
					<option value="4">石材类外墙面</option>
				</select>
				</span> 
			</div>
		</div> 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">封面图片：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="btn-upload form-group">
				<input class="input-text upload-url" type="text" name="uploadfile" id="uploadfile" readonly nullmsg="请添加附件！" style="width:200px">
				 <a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 浏览文件</a>
				    <input type="file" name="uploadfile" class="input-file"  accept="image/jpg,image/png,image/jpeg" required>
				</span> 
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;创建方案&nbsp;&nbsp;"> 
			<!-- 	<button onClick="planAdd()" class="btn btn-primary radius" type="button">创建方案</button> -->
			</div>
		</div>
	</form> 
</article>

<!--_footer 作为公共模版分离出去--> 
<script type="text/javascript" src="Admin/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="Admin/lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="Admin/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="Admin/lib/jquery.validation/1.14.0/jquery.validate.min.js"></script> 
<script type="text/javascript" src="Admin/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="Admin/lib/jquery.validation/1.14.0/messages_zh.min.js"></script> 
<script type="text/javascript" src="Admin/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="Admin/static/h-ui.admin/js/H-ui.admin.js"></script> 
<!--/_footer /作为公共模版分离出去--> 

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript">
function toValid(){
	
}
function planAdd(){
	alert("123");
 	var fd = new FormData();
	var fileObj = document.getElementById("uploadfile").files[0];
	alert(fileObj);
	if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
        alert("请选择图片");
        return;
    }
	
	//fd.append("planName",$("#planName").val());
	//fd.append("planFloor",$("#planFloor").val());
	//fd.append("planIntro",$("#planIntro").val());
	/* fd.append("file",fileObj);
	$.ajax({
		url:"../upload/uploadFormData",
		type:"post",
		data:fd,
		processData:false,   //不处理数据
	    contentType:false,    //不设置内容类型
	    success:function(data){
	    	//alert("方案添加成功，请继续在以下页面录入相关图片，或在方案列表页面编辑您的方案");
	    	alert("yes")
	    	alert(JSON.stringify(data));
	    },
	    error:function(e){
	    	alert(e.responseText);
	    	alert("方案添加失败，请刷新页面重新添加");
	    }
	});  */
}
function validate(){
	var author = $("#author").val();
	var planName = $("#planName").val();
	var floor = $("#floor").val();
	var area = $("#area").val();
	var areaLength = $("#areaLength").val()
	var areaWidth = $("#areaWidth").val();
}
</script> 
<!-- /* $(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		 rules:{
			username:{
				required:true,
				minlength:2,
				maxlength:16
			},
			sex:{
				required:true,
			},
			mobile:{
				required:true,
				isMobile:true,
			},
			email:{
				required:true,
				email:true,
			},
			uploadfile:{
				required:true,
			},
			
		}, 
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			//$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
}); 
*/ -->


<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>