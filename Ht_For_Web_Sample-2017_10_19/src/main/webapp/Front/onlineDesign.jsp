<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
        <title>在线设计</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--[if lte IE 7]>
        <link rel="stylesheet" type="text/css" href="css-files/ie-fix/ie67.css" />
        <![endif]--> 
        
        <!--[if IE 8]>
            <link rel="stylesheet" type="text/css" href="css-files/ie-fix/ie8.css">
        <![endif]--> 
        
        <!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
   
    <!-- Main CSS file -->
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="external/bootstrap/css/bootstrap.css"/> <!-- CSS: Bootstrap -->
        <link rel="stylesheet" type="text/css" href="css-files/getCss.css" /> <!-- CSS: Our css :)  -->
            
          <!-- js 3D 轴测图 -->
         <link rel="stylesheet" href="css-files/style.css" />
        <link rel="stylesheet" href="css-files/demo.css"/> <!-- CSS: Bootstrap -->
        <link rel="stylesheet" type="text/css" href="css-files/normalize.css" /> <!-- CSS: Our css :)  -->
        <!-- jQuery -->    
        <script type="text/javascript" src="js/jquery.min.js"></script>    
        <script type="text/javascript" src="external/jquery-ui-1.8.21.custom.min.js"></script>  <!-- JS: effects core + fold and clip -->   
        
        <!-- JS -->
       <!--<script type="text/javascript" src="js/scripts.js"></script><!-- Scripts -->
        
    <!-- design-demo -->
        <link href="css/jquery-accordion-menu.css" rel="stylesheet" type="text/css" />
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css" />
        <link href="js/css/layui.css" rel="stylesheet" type="text/css" />
        <link href="js/css/csss.css" rel="stylesheet" type="text/css" />
        <script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
        <script src="js/layui.js" type="text/javascript"></script>
        <script src="js/onlDes.js" type="text/javascript"></script>
   <!-- <script src="js/onlineDesign.js" type="text/javascript"></script>-->
		<style>
		.gezi-background{
			background-size: cover;
			background-repeat:no-repeat;
			width:100%;
			height:100%;
			background-image: url(images/onlDec/gezi.png) ;
		}
		a{font-size:17px;}
        .Navigation a{
			font-size:15px;
		}
        </style>
    </head>
    <body>

       <div class="container" style="width:80%;">
            <div class="row header">
                <div class="span5">
                     <!-- logo -->
                   <div style="float:left;">
                   		 <a href=""><img class="logo" src="images/header/logo.png" alt="" style="width:60px;"/> </a>
                  	</div>
                      <div style="display:inline;font-size:24px;line-height:50px;"><strong>农房工业化在线设计平台</strong></div>
                </div>
                <div class="span8 Navigation" >
                    <!-- responsive dropdown menu -->
                    <div class="js-jquery-dropdown-wrapper">    
                        <ul class="js-jquery-dropdown" >
                            <li><a href="index-demo.jsp" class="on">首页</a> </li>
                            <li><a href="news.jsp">新闻动态</a> </li>
							 <li><a href="project.jsp">试点工程</a></li>
                            <li class="menu-selected"><a href="onlineDesign.jsp">在线设计</a></li>
                            <li><a href="onlineDec.jsp">在线咨询</a> </li>
                            <li><a href="Download.jsp">政策法规 </a></li>
                            <li><a href="index-demo.jsp#contact">联系方式</a></li>
                        </ul>
                        
                    </div> <!-- /menu -->
                </div>
            </div> <!-- /.row -->
        </div> <!-- /.container -->  
    
<div class="content father" id="content_father" style="min-height:100%;">
   <button class="no" id="btnRtn" onclick="returns('btnRtn')"> <i class="layui-icon">返回</i> </button>
   <button class="no" id="btnRtn2" > <i class="layui-icon">返回</i> </button>
   <div class=" jquery-accordion-menu  son1" style="background-color:#fff;">
    <div id="jquery-accordion-menu" class="jquery-accordion-menu white ">
      <div class="jquery-accordion-menu-MENU" style="font-size:25px;">
      菜单
    </div>
     <ul id="demo-list">

      <li><a href="#"><img src="images/onlDec/area.ico" style="width:20px;">&nbsp;输入用地面积 </a>
        <ul class="submenu">
          <li><a href="#"><input id="area" class="inpt" type="tel" placeholder="输入用地面积"/></a></li>
        </ul>
      </li>
      <li><a href="#"><img src="images/onlDec/floor.ico" style="width:20px;">&nbsp;输入建筑层数 </a>
        <ul class="submenu">
          <li data-c="isure"><a href="#"><input id="floor" class="inpt" type="tel" placeholder="输入建筑层数"/></a></li>
        </ul>
      </li>
       <li><a href="#"><img src="images/onlDec/style.ico" style="width:20px;">&nbsp;建筑风格 </a>
        <ul class="submenu">
          <li><a href="#">
          	<select name="selected" id="style" class="inpt" style="border-radius:0;">  
          		<option value="传统">传统</option>
          		<option value="现代">现代</option>
				<option value="欧式">欧式</option>
			</select>
			</a>
		   </li>
        </ul>
      </li>
    <!--<li><a href="#"><i class="fa fa-cog"></i>输入功能房 </a>
       <ul class="submenu">
        <li><a href="#">一层 </a>
         <ul class="submenu">
          <li><a href="#">客&nbsp;&nbsp;&nbsp;厅：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">卧&nbsp;&nbsp;&nbsp;室：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">厨&nbsp;&nbsp;&nbsp;房：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">洗手间：&nbsp;&nbsp; <input type="text" class="inpt" /></a></li>
         </ul> </li>
       </ul>
       <ul class="submenu">
        <li><a href="#">二层 </a>
         <ul class="submenu">
          <li><a href="#">客&nbsp;&nbsp;&nbsp;厅：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">卧&nbsp;&nbsp;&nbsp;室：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">厨&nbsp;&nbsp;&nbsp;房：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">洗手间：&nbsp;&nbsp; <input type="text" class="input_type" /></a></li>
         </ul> </li>
       </ul> </li>  class="disabled hli"--> 
      <li><a href="#"><img src="images/onlDec/type.ico" style="width:20px;" />一键布置户型 </a>
      <ul class="submenu">
      	  <li><a href="#" onclick="searchPlan()"><i class="fa fa-suitcase"></i>可选择户型图</a></li>
	      <li><a href="#" style="visibility:hidden;" id="Isome"><i class="fa fa-suitcase"></i>生成轴测图 </a></li>
	      <li><a href="#" style="visibility:hidden;" id="Eleva"><i class="fa fa-suitcase"></i>生成立面图 </a></li>
	 	  <li><button id="planDownLoad" onclick="return download();" class="layui-btn-radius" style="width:100px;height:35px;margin:10px 30%;backgroundColor:#d2d2d2;visibility:hidden;">方案下载</button></li>
	  </ul></li>  
     </ul>
    </div>
   </div>
   <div class="son2 box_column gezi-background" id="imgz" style="margin:0 2% 30px 2%;height:auto;">
      <div style="float:right"><img src="images/onlDec/zhinan.png" style="width:100px;float:right;margin:10px;"/></div>
   </div>
</div>
    <!-- FOOTER -->
    <footer id="footer" style="position:relative; bottom:0;width:100%;">
        <div class="container">
            <div class="row">
                <!-- SOCIAL ICONS -->
                <div class="text-center">
                        <a href="index-demo.jsp#header">首页</a>
                    
                    |
                        <a href="news.jsp">新闻动态</a>
                    |
                         <a href="onlineDesign.jsp">在线设计 </a>
                    |
                        <a href="onlineDec.jsp">在线咨询</a>
                    |
                        <a href="Download.jsp">下载 </a>
                    <br/>
                </div>
                <div class="text-center">
                    <p class=""><i class="fa fa-map-marker"></i> <strong> 地址： </strong> 宁波市江北区风华路 201号 宁波工程学院 建筑与交通工程学院大楼 B310</p>
                    <p>Copyright &copy; 2017.11.1 XXXX公司保留所有权利</p>
                </div>
            </div>
        </div>
    </footer>
    <!-- /FOOTER -->
</body>

<script type="text/javascript">
var t;
var planId; //方案id
var area,floor;  //面积，楼层
function trim(t){
	return (t||"").replace(/^\s+|\s+$/g, "");
}
function ct(){
    return document.compatMode == "BackCompat"? document.body.clientHeight:document.documentElement.clientHeight;
}
var f=document.getElementById('footer');
(window.onresize=function(){
    f.style.position=document.body.scrollHeight>ct()?'':'absolute';
})();

function download(){
	alert("您可以下载该方案");
	return;
}
function changeStyle(osel){
	var styleSet = osel.options[osel.selectedIndex].text;
	if(styleSet != "传统"){
		alert("不好意思，系统中查找不到您要的建筑风格")
	}
}
</script>
</html>
