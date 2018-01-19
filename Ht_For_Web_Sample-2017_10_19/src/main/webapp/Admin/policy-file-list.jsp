<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
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
<link rel="stylesheet" type="text/css" href="Admin/lib/laypage/1.2/plugins/layui/css/layui.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>政策文件</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 资讯管理 <span class="c-gray en">&gt;</span> 政策文件 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<input type="text" name="" id="searchInfo" placeholder="新闻名称" style="margin-left:35%;width:250px" class="input-text">
		<button class="btn btn-success" onclick="getNewList(1);showPage();"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:batchDelete();" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a class="btn btn-primary radius" data-title="创建新闻" href="Admin/add-new.jsp" onclick="www.baidu.com" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 创建新闻</a></span> <span class="r">共有数据：<strong id="num"></strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="120">新闻标题</th>
					<th width="80">作者</th>
					<th width="120">发布时间</th>
					<th width="60">发布状态</th>
					<th width="120">操作</th>
				</tr>
			</thead>
			<tbody id="tbody">
			</tbody>
		</table>
		<div class="admin-table-page">
			<div id="page" class="page"></div>
		</div>
	</div>
</div>
<script type="text/javascript" src="Admin/lib/jquery/1.9.1/jquery.js"></script> 
<script type="text/javascript" src="Admin/lib/layer/2.1/layer.js"></script> 
<!-- <script type="text/javascript" src="Admin/lib/laypage/1.2/laypage.js"></script>  -->
<!--<script type="text/javascript" src="Admin/lib/My97DatePicker/WdatePicker.js"></script> -->
<script type="text/javascript" src="Admin/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="Admin/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="Admin/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="Admin/lib/laypage/1.2/plugins/layui/layui.js"></script>
<script type="text/javascript">

var page=1;
var pageNow=1;
$(document).ready(function(){
	getNewList(page);
	showPage();
})

/*资讯-添加*/
function article_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*资讯-编辑*/
function article_edit(title,url,id,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*新闻-删除*/
function new_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		var isOk = newDel(id);
		if(isOk){
			$(obj).parents("tr").remove();
			layer.msg('已删除!',{icon:1,time:1000});
		}else{
			layer.msg('程序出错啦，请再试一次',{icon:2,time:1000});
		}
	});
}
/*新闻-审核*/
function new_shenhe(obj,id){
	layer.confirm('审核新闻？', {
		btn: ['通过','不通过','取消'], 
		shade: false,
		closeBtn: 0
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}
/*资讯-下架*/
function new_stop(obj,id){
	layer.confirm('确认要取消发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">取消发布</span>');
		$(obj).remove();
		layer.msg('已取消发布!',{icon: 5,time:1000});
	});
}

/*资讯-发布*/
function article_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}
/*资讯-申请上线*/
function article_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}

var page = 1;
var searchInfo = null;
$(document).ready(function(){
	getNewList(1);
})

//获取新闻列表
function getNewList(page){
	searchInfo = $("#searchInfo").val();
	$.ajax({
		type:"post",
		url:"new/newList",
	    data:{ page:page,searchInfo:searchInfo},
		dataType:"json",
		success:function(data){
		    $("#tbody").empty();
		    
		    var state = "";                  //状态文字
			var spanColor = "";              //状态颜色
			
		    for(var i=0;i<data.length;i++){
		    	
		    	if(data[i].newStatus == 1){
		    		state = "未发布";
		    		spanColor = "label label-warning radius";
		    		operation = "<td class='f-14 td-manage'><a style='text-decoration:none' "
    					+"onClick='article_stop(this,'10001')' href='javascript:;' title='发布'>"
    					+"<i class='Hui-iconfont'>&#xe6de;</i></a>"
    					+"<a style='text-decoration:none' class='ml-5'"
    					+"onClick='article_edit('资讯编辑','article-add.html','10001')' href='javascript:;'"
    					+"title='编辑'><i class='Hui-iconfont'>&#xe6df;</i></a> <a style='text-decoration:none' class='ml-5'" 
    					+"onClick='new_del(this,"+data[i].newId+")' href='javascript:;' title='删除'><i class='Hui-iconfont'>&#xe6e2;</i></a></td>";
		    	}else{
		    		state = "已发布";
		    		spanColor = "label label-success radius";
		    		operation = "<td class='f-14 td-manage'><a style='text-decoration:none' "
		    					+"onClick='new_stop(this,"+data[i].newId+")' href='javascript:;' title='取消发布'>"
		    					+"<i class='Hui-iconfont'>&#xe6de;</i></a>"
		    					+"<a style='text-decoration:none' class='ml-5'"
		    					+"onClick='article_edit('资讯编辑','article-add.html','10001')' href='javascript:;'"
		    					+"title='编辑'><i class='Hui-iconfont'>&#xe6df;</i></a> <a style='text-decoration:none' class='ml-5'" 
		    					+"onClick='new_del(this,"+data[i].newId+")' href='javascript:;' title='删除'><i class='Hui-iconfont'>&#xe6e2;</i></a></td>";
		    	}
		    	
		   		$("#tbody").append("<tr class='text-c'>"
					+"<td><input type='checkbox' name='check' value='"+data[i].newId+"'></td>"
					+"<td class='text-l'><u style='cursor:pointer' class='text-primary' onClick='article_edit('查看','article-zhang.html','10001')' title='查看'>"+data[i].newTitle+"</u></td>"
					+"<td>"+data[i].author+"</td>"
					+"<td>"+data[i].createTime+"</td>"
					+'<td class="box-msg"><span class="'+spanColor+'">'+state+'</span></td>'
					+operation
				+"</tr>");
		    }
		}
	});
}
var newId;
//删除数据库中的新闻记录
function newDel(newId){
	var isOk = true;
	$.ajax({
		type: "post",
		url:  "new/delNew",
		async: false,
		data: { newId:newId},
		dataType:"json",
		success:function(data){
		    isOk = true;
		},
		error:function(){
			isOk = false;
		}
	});
	return isOk;
}

//显示页码
function showPage(){
	
	$.ajaxSetup({                //设置同步
	    async : false  
	}); 
	
	var pageAll = 0;
	searchInfo = $("#searchInfo").val();
	//var productId = $(".input-text").val();          //获取线路编号
	
	$.post("new/newNum", {searchInfo:searchInfo},function(json) {
		$("#num").html(""+json+"")
		pageAll = Math.ceil(json/10);         //页数
	});
	
	 layui.config({
		base: 'Admin/lib/laypage/1.2/plugins/layui/modules/'
	});

	layui.use(['icheck', 'laypage','layer'], function() {
		var $ = layui.jquery,
			laypage = layui.laypage,
			layer = parent.layer === undefined ? layui.layer : parent.layer;

		//page
		laypage({
			cont: 'page',
			pages: pageAll,     //总页数
			groups: 5,		//连续显示分页数
				
			jump: function(obj, first) {
				//得到了当前页，用于向服务端请求对应数据
				var curr = obj.curr;
				pageNow = curr;
				if(!first) {
					getNewList(curr);
				}
			}
		});
		
	});
}
function batchDelete(){
	alert("batchDelete");
	if(!confirm("确认要删除这些记录吗?")) return;
	var cks = document.getElementsByName("check");
	var str="";
	for(var i=0;i<cks.length;i++){
		if(cks[i].checked){
			str+=cks[i].value+",";
		}
	}
	str = str.substring(0,str.length - 1);
	alert("str"+str);
}
</script>
</body>
</html>