<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
        <title>工程介绍2</title>
        
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

		<script type="text/javascript" src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script type="text/javascript" src="js/fresco/fresco.js"></script>
		<link rel="stylesheet" type="text/css" href="css/fresco/fresco.css" />
		
        <link href="external/bootstrap/css/bootstrap.css" rel="stylesheet"/> <!-- CSS: Bootstrap -->
        <link rel="stylesheet" type="text/css" href="css-files/getCss.css" /> <!-- CSS: Our css :)  -->
      	<link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="external/fancybox/jquery.fancybox-1.3.4.css" /> <!-- CSS: fancybox -->
        <!-- Google fonts -->    
<!--         <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&amp;subset=latin" rel="stylesheet"> -->
        <link rel="stylesheet" href="css/zzsc.css" />    
        <!-- jQuery -->    
        <script type="text/javascript" src="javascript/jquery.min.js"></script>    
        <script type="text/javascript" src="external/jquery-ui-1.8.21.custom.min.js"></script>  <!-- JS: effects core + fold and clip -->   
        
        <!-- external stuff -->    
        <script type="text/javascript" src="javascript/custom.js"></script> <!-- JS: Our script :) -->
        <script type="text/javascript" src="external/fancybox/jquery.fancybox-1.3.4.pack.js"></script> <!-- JS: fancybox - modal image-->
        <script type="text/javascript" src="external/fx.js"></script> <!-- JS: jquery fx used for the bar animation -->
        <script type="text/javascript" src="external/jquery.nicescroll.min.js"></script> <!-- JS: nicescroll - the nice scrolling bar from index -->
        <script type="text/javascript" src="external/jquery.masonry.min.js"></script> <!-- JS: masonry - portofolio new tile script -->
        
        
        
        <script type="text/javascript" src="external/nivo-slider/jquery.nivo.slider.pack.js"></script> <!-- JS: nivo slider -->
        <link rel="stylesheet" type="text/css" href="external/nivo-slider/nivo-slider.css" /> <!-- CSS: nivo slider -->
        
        <script type="text/javascript" src="external/jquery.bxSlider/jquery.easing.1.3.js"></script> <!-- bx Slider -->
        <script type="text/javascript" src="external/jquery.bxSlider/jquery.bxSlider.min.js"></script> <!-- bx Slider -->
    <style>
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
							 <li class="menu-selected"><a href="project.jsp">试点工程</a></li>
                            <li><a href="onlineDesign.jsp">在线设计</a></li>
                            <li><a href="onlineDec.jsp">在线咨询</a> </li>
                            <li><a href="Download.jsp">政策法规 </a></li>
                            <li><a href="index-demo.jsp#contact">联系方式</a></li>
                        </ul>
                        
                    </div> <!-- /menu -->
                </div>
            </div> <!-- /.row -->
        </div> <!-- /.container -->         
            
            <div class="header-barWrapper js-header-animation">
                
                <div class="container header-bar">
                    <div class="row">
                        <div class="span9">
                            <h3>工程介绍</h3>
                            <div class="header-page-description">project details</div>
                        </div>
						<!-- 
                        <div class="span3 ">
                            <div class="header-search">
                                <div class="input-append">
                                    <input class="span2" id="appendedInputButton" size="16" type="text"><button class="btn" type="button"><i class="icon-search"></i></button>
                                </div>
                            </div>
                        </div> -->
                    </div>
                </div>
            </div>
          

<!--工程图纸展示-->
<div class="container">
    <div class="row portofolio-projectDetails">
        <div class="span8">
            <div>
                <a href="" id="mainPicHref">
                    <img src="" alt="" id="mainPicImg"/>
                </a>
            </div>
        </div>
        

        <div class="span4">
            <div class="portofolio-imageGridTitle"><h3 id="prj-name">Architecture photography</h3></div>
            <div class="portofolio-projectMeta">
                <a href="#" class="tag">12 May 2012</a>
                <a href="#" class="tag">Photo</a>
                <span class="portofolio-for">for Arch</span>
            </div>
            <div class="portofolio-imageGridContent" id="prj-info">Any exterior or interior view of your company headquarters or offices is an architecture photograph. In fact, all company. </div>           
            
            <a href="#" class="black-link">Visit website</a>
        </div>
    </div>
    
    <div class="row responsive-center">
        <div class="span12">
            <h4>工程效果图展示</h4>
        </div>
    </div>
     
  <div class="row portofolio-imageGridRow portofolio-js portofolio-3-cols" style="height:auto;" id="prjModel">
        <div class="span4 portofolio-item portofolio-brands">
            <div>
                <a href="images/projectPic/project1.jpg"
                class='fresco'
	             data-fresco-group='projectPic1'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/projectPic/project1.jpg" alt=""/>
                </a>
            </div>
            <div class="portofolio-imageGridTitle">Fashion photography</div>
            <div class="portofolio-imageGridContent">If you have a location available for shooting and editing.</div>
        </div>
        
        <div class="span4 portofolio-item portofolio-photo">
            <div>
                <a href="images/projectPic/project2.jpg"
                class='fresco'
	             data-fresco-group='projectPic2'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/projectPic/project2.jpg" alt=""/>
                </a>
            </div>
            <div class="portofolio-imageGridTitle">Architecture photography</div>
            <div class="portofolio-imageGridContent">Any exterior or interior view of your company headquarters.</div>
        </div>
        
        <div class="span4 portofolio-item portofolio-graphic">
            <div>
                <a href="images/projectPic/project3.jpg"
                class='fresco'
	             data-fresco-group='projectPic3'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/projectPic/project3.jpg" alt=""/>
                </a>
            </div>
            <div class="portofolio-imageGridTitle">Food studio session</div>
            <div class="portofolio-imageGridContent">His designs communicate a clear point of view reflecting.</div>
        </div>

</div>

<!-- 工程图纸展示 -->
<div id="content" style="padding-bottom: 50px;">
	<div class="row">
	   <div class="span12">
	    <h4>工程图纸展示</h4>
	    </div>
	 </div>
    <div class="mygallery clearfix">
	<div class="tn3 album">
	 <!--  <h4>试点公共图纸</h4>
	    <div class="tn3 description">修饰图片</div>
	    <div class="tn3 thumb">images/620x378/1.png</div> -->  
	    <ul id="designPic">
		<li>
		    <h4>Hohensalzburg Castle</h4>
		    <div class="tn3 description">Salzburg, Austria</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/1.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/1.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/2.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/2.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/3.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/3.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/4.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/4.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/5.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/5.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/6.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/6.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/7.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/7.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/12.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/12.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/9.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/9.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/10.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/10.jpg" />
		    </a>
		</li>
		<li>
		    <h4>Isolated sandy cove</h4>
		    <div class="tn3 description">Zakynthos island, Greece</div>
		    <a href="/prjImg/象山莲花村老年公寓/工程图纸/11.jpg">
			<img src="/prjImg/象山莲花村老年公寓/工程图纸/11.jpg" />
		    </a>
		</li>
	</ul>
	</div>
	</div>
	</div>
	</div>
<!--工程图纸展示-->

<!-- 现场施工图 -->
<div class="container">
    <div class="row portofolio-projectDetails">
       <div class="row responsive-center">
        <div class="span12">
            <h4>现场施工图</h4>
        </div>
    </div>
     
  <div class="row portofolio-imageGridRow portofolio-js portofolio-3-cols" style="height:auto;" id="prjModel">
        <div class="span4 portofolio-item portofolio-brands">
            <div>
            <a href="images/test-prj/portfolio-1.jpg" 
                 class='fresco'
	             data-fresco-group='example1'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/test-prj/portfolio-1.jpg" alt=""/>
                </a>
                
            <a href="images/test-prj/portfolio-2.jpg" 
                 class='fresco'
	             data-fresco-group='example1'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
	             </a>
            </div>
            <div class="portofolio-imageGridTitle">Fashion photography</div>
            <div class="portofolio-imageGridContent">If you have a location available for shooting and editing.</div>
        </div>
        
        <div class="span4 portofolio-item portofolio-photo">
            <div>
            <a href="images/test-prj/portfolio-1.jpg" 
                 class='fresco'
	             data-fresco-group='example2'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/test-prj/portfolio-1.jpg" alt=""/>
                </a>
            </div>
            <div class="portofolio-imageGridTitle">Architecture photography</div>
            <div class="portofolio-imageGridContent">Any exterior or interior view of your company headquarters.</div>
        </div>
        
        <div class="span4 portofolio-item portofolio-graphic">
            <div>
            <a href="images/test-prj/portfolio-1.jpg" 
                 class='fresco'
	             data-fresco-group='example3'
	             data-fresco-caption="Fashion photography,If you have a location available for shooting and editing.">
                    <img src="images/test-prj/portfolio-1.jpg" alt=""/>
                </a>
            </div>
            <div class="portofolio-imageGridTitle">Food studio session</div>
            <div class="portofolio-imageGridContent">His designs communicate a clear point of view reflecting.</div>
        </div>
        </div>
</div>
</div>
<!-- 现场施工图 -->

<!-- 现场视频 -->
<div id="content" style="padding-bottom: 50px;">
	<div class="row">
	   <div class="span12">
	    <h4>现场视频</h4>
	    </div>
	 </div>
    <div class="mygallery clearfix">
	<div class="tn3 album">
	    <ul id="designPic">
		<li>
		    <h4>Hohensalzburg Castle</h4>
		    <div class="tn3 description">Salzburg, Austria</div>
		    <a href="/prjImg/奉化大埠村文化礼堂/工程图纸/1.jpg">
			<img src="/prjImg/奉化大埠村文化礼堂/工程图纸/1.jpg" />
		    </a>
		</li>
	</ul>
	</div>
	</div>
	</div>
<!--现场视频-->

          <!-- FOOTER -->
    <footer id="footer">
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
                        <a href="Download.jsp">政策法规 </a>
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
    <div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
<script>
$(document).ready(function() {
	var tn1 = $('.mygallery').tn3({
		skinDir:"skins",
		imageClick:"fullscreen",
		image:{
		maxZoom:1.5,
		crop:true,
		clickEvent:"dblclick",
		transitions:[{
		type:"blinds"
		},{
		type:"grid"
		},{
		type:"grid",
		duration:460,
		easing:"easeInQuad",
		gridX:1,
		gridY:8,
		// flat, diagonal, circle, random
		sort:"random",
		sortReverse:false,
		diagonalStart:"bl",
		// fade, scale
		method:"scale",
		partDuration:360,
		partEasing:"easeOutSine",
		partDirection:"left"
		}]
		}
	});
});
</script>
<script stype="text/javascript">
//获取url中的参数
function getUrlParam(name) {
   var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg); //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}
var projectId = getUrlParam("projectId");
var i;
$(document).ready(function(){
	getProject(projectId);
})
var prjName;
function getProject(projectId){
	$.ajax({
		type:"post",
		url:"../prjEntity?projectId="+projectId,
	//	data:{projectId:projectId},
	//	dataType:"json",
		contentType:"application/json",
		success:function(data){
			document.getElementById("prj-info").innerHTML = data.projectIntro;
			document.getElementById("prj-name").innerHTML = data.projectName;
			prjName=document.getElementById("prj-name").innerHTML;
			$("#mainPicHref").attr("href","/prjImg/"+data.projectName+"/"+data.mainPic);
			$("#mainPicImg").attr("src","/prjImg/"+data.projectName+"/效果图/"+data.mainPic);
			getPrjPicList(projectId,1,data.projectName);
			//getPrjPicList(projectId,2,data.projectName);
		}
	});
}

//tag=1:获取工程图纸，tag=2:获取效果图
var tag;
function getPrjPicList(projectId,tag,prjName){
	$.ajax({
		type:"post",
		url:"../prjPicList?projectId="+projectId+"&&tag="+tag,
		contentType:"application/json",
		success:function(data){
			//效果图显示
			if(tag==1){
				$("#prjModel").empty();
				for(i=0;i<6;i++){
					$("#prjModel").append(
						'<div class="span4 portofolio-item portofolio-brands"><div>'
			                +'<a  target="_blank" href="/prjImg/'+prjName+'/效果图/'+data[i].picName+'">'
			                   +'<img src="/prjImg/'+prjName+'/效果图/s'+data[i].picName+'" />'
			                +'</a>'
			           +'</div>'
			            +'<div class="portofolio-imageGridTitle">Fashion photography</div>'
			            +'<div class="portofolio-imageGridContent">If you have a location available for shooting and editing.</div>'
			      + '</div>');
			   }
			}
			}
	});
}

</script>
<script src="js/jquery.tn3lite.min.js"></script>
</html>
