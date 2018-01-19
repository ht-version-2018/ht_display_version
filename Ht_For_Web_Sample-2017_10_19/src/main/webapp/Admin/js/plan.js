/**
 * 方案相关函数
 */

function planDel(planId){
	var isOk = true;
	$.ajax({
		type: "post",
		url:  "planAdmin/delPlan",
		async: false,
		data: { planId:planId},
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

//显示方案列表
function getPlanList(page, searchInfo){
	
	$.ajax({
		type: "post",
		url: "planAdmin/planList",
		data: { page:page,
			    searchInfo:searchInfo
			  },
		dataType:"json",
		success:function(data){
		    $("#tbody").empty();
		    
			var state = "";                  //状态文字
			var spanColor = "";              //状态颜色
			var operation = "";              //操作
			
		    for(var i=0;i<data.length;i++){
		   		
		    	if(data[i].auditState== 0){
		    		state = "待审核";
		    		spanColor = "label label-warning radius";
		    		operation = '<td class="box-msg mana">'
						+'<a style="text-decoration:none" title="启用" href="javascript:;"><i class="Hui-iconfont">&#xe6e1;</i></a>'
						+'<a title="编辑" href="javascript:;" onclick="member_edit()" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>'
						+'<a title="删除" href="javascript:;" onclick="plan_del(this,'+data[i].planId+')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>';
		    	}else if( data[i].auditState == 1 ){
					state = "通过";
					spanColor = "label label-success radius";
					operation = '<td class="box-msg mana">'
						+'<a style="text-decoration:none" title="启用" href="javascript:;"><i class="Hui-iconfont">&#xe631;</i></a>'
						+'<a title="编辑" href="javascript:;" onclick="member_edit()" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>'
						+'<a title="删除" href="javascript:;" onclick="plan_del(this,'+data[i].planId+')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>';
				}else if( data[i].auditState == 2 ){
					state = "不通过";
					spanColor = "label label-danger radius";
					operation = '<td class="box-msg mana">'
						+'<a style="text-decoration:none" title="启用" href="javascript:;"><i class="Hui-iconfont">&#xe631;</i></a>'
						+'<a title="编辑" href="javascript:;" onclick="member_edit()" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>'
						+'<a title="删除" href="javascript:;" onclick="plan_del(this,'+data[i].planId+')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>';
				}
		    	
		    	$("#tbody").append('<tr class="text-c">'
					+'<td><input type="checkbox" value="" name=""></td>'
					+'<td class="text-l"><a class="maincolor" href="javascript:;" onclick="picture_edit(\'方案查看\',\'Admin\/plan-content.jsp\','+data[i].planId+')">'+data[i].planName+'</u></td>'
					+'<td>'+data[i].author+'</td>'
					+'<td>'+data[i].floor+'</td>'
					+'<td>'+data[i].area+'</td>'
					+'<td>'+data[i].createTime+'</td>'
					+'<td>'+data[i].download+'</td>'
					+'<td class="box-msg"><span class="'+spanColor+'">'+state+'</span></td>'
					+''+operation+''
					+'</tr>'); 
		    } 
		}
	});
}

//显示页码
function showPage(){
	
	$.ajaxSetup({                    //设置同步
	    async : false  
	}); 
	
	var pageAll = 0;
	
	$.post("planAdmin/planNum", {
		searchInfo:searchInfo,
	}, function(json) {
		document.getElementById("num").innerHTML = json;          //总数据
		pageAll = Math.ceil(json/10);               //页数
	});
	
	
	layui.config({
		base: './Admin/Mode/plugins/layui/modules/'
	}); 

	layui.use(['icheck', 'laypage','layer'], function() {
		var $ = layui.jquery,
			laypage = layui.laypage,
			layer = parent.layer === undefined ? layui.layer : parent.layer;
		$('input').iCheck({
			checkboxClass: 'icheckbox_flat-green'
	});

	//page
	laypage({
		cont: 'page',
		pages: pageAll //总页数
			,
		groups: 5 //连续显示分页数
			,
		jump: function(obj, first) {
			//得到了当前页，用于向服务端请求对应数据
			var curr = obj.curr;
			if(!first) {
				getPlanList(curr, searchInfo);     //跳转
			}
		}
	});
	});
}