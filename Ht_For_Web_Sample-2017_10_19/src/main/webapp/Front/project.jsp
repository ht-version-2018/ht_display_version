<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
        <title>试点工程</title>
        
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

    <link rel="stylesheet" href="css/font-awesome.css" />
        <link rel="stylesheet" href="external/bootstrap/css/bootstrap.css"/> <!-- CSS: Bootstrap -->
        <link rel="stylesheet" type="text/css" href="css-files/getCss.css" /> <!-- CSS: Our css :)  -->
            
        <!-- jQuery -->    
        <script type="text/javascript" src="js/jquery.min.js"></script>    
        <script type="text/javascript" src="external/jquery-ui-1.8.21.custom.min.js"></script>  <!-- JS: effects core + fold and clip -->   
        
        <!-- JS -->
        <script type="text/javascript" src="js/scripts.js"></script><!-- Scripts -->
		<style>a{font-size:17px;}
        .Navigation a{
			font-size:15px;
		}
		
		@-moz-keyframes myMove {
  0% {padding-top:30px;}
  100% {padding-top:50px;}
}
@-webkit-keyframes myMove {
  0% {padding-top:30px;}
  100% {padding-top:50px;}
}
@-o-keyframes myMove {
  0% {padding-top:30px;}
  100% {padding-top:50px;}
}
@keyframes myMove {
  0% {padding-top:30px;}
  100% {padding-top:50px;}
}
#down {
  text-align: center;
  height: 150px;
  -moz-animation: myMove 1s linear infinite alternate; 
  -webkit-animation: myMove 1s linear infinite alternate;
  -o-animation: myMove 1s linear infinite alternate;
  animation: myMove 1s linear infinite alternate;
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
                            <h3>试点工程</h3>
                            <div class="header-page-description">Pilot project.</div>
                        </div>
                    </div>
                </div>
            </div>
          

        <div class="container">
            <div class="row">
                
                <!-- #content -->
                <div id="content" class="span10">
                    
                    <!-- .post -->
                    <article class="post">
                        <!-- .entry-header -->
                        <header class="entry-header" style="position:relative;">
                            <hgroup>
                                <h4 class="entry-title">
                                    <a href="#" rel="bookmark">试点工程一 ：解危住宅</a>
                                </h4>
                            </hgroup>
                        </header>
                        
                        <!-- .entry-content -->
                        <div class="entry-content ty-full-width ty-border-left">
                            <div class="alignleft image-wrap">
                                <a href="projectDetail.jsp?projectId=2" target="_black">
                                    <img src="images/test-prj/portfolio-1.jpg" alt=""/>
                                </a>
                            </div><br/><br/>
                            <p> <i class="fa fa-building"></i><strong> 工程名称 : </strong>解危住宅</p>
                            <p> <i class="fa fa-map-marker"></i><strong> 工程地点 : </strong>江北裘市村</p>
                            <p> <i class="fa fa-tags"></i><strong> 工程时间 : </strong>2017-10-10</p> 
                            <div class="image-clear"></div>
                        </div>
                    </article> <!-- /.post -->
                    
                    
                    <!-- .post -->
                    <article class="post">
                        <!-- .entry-header -->
                        <header class="entry-header" style="position:relative;">
                            <hgroup>
                                <h4 class="entry-title">
                                    <a href="#" rel="bookmark">试点工程二 ： 村民活动中心</a>
                                </h4>
                            </hgroup>
                        </header>
                        
                        <!-- .entry-content -->
                        <div class="entry-content ty-full-width ty-border-left">
                             <div class="alignright image-wrap">
                                <a href="projectDetail1.jsp?projectId=1" target="_black">
                                    <img src="images/test-prj/portfolio-2.jpg" alt=""/>
                                </a>
                            </div><br/><br/>
                            <p> <i class="fa fa-building"></i><strong> 工程名称 : </strong>村民活动中心</p>
                            <p> <i class="fa fa-map-marker"></i><strong> 工程地点 : </strong>奉化大埠村</p>
                            <p> <i class="fa fa-tags"></i><strong> 工程时间 : </strong>2017-10-10</p> 
                            <div class="image-clear"></div>
                        </div>
                    </article> <!-- /.post -->

                    <!-- .post -->
                    <article class="post">
                        <!-- .entry-header -->
                        <header class="entry-header" style="position:relative;">
                            <hgroup>
                                <h4 class="entry-title">
                                    <a href="#" rel="bookmark">试点工程三 ：村民安置房</a>
                                </h4>
                            </hgroup>
                        </header>
                        
                        <!-- .entry-content -->
                        <div class="entry-content ty-full-width ty-border-left">
                        	 <div class="alignleft image-wrap">
                                <a href="projectDetail2.jsp?projectId=3" target="_black">
                                    <img src="images/test-prj/portfolio-3.jpg" alt=""/>
                                </a>
                            </div><br/><br/>
                            <p> <i class="fa fa-building"></i><strong> 工程名称 : </strong>村民安置房</p>
                            <p> <i class="fa fa-map-marker"></i><strong> 工程地点 : </strong>象山莲花村</p>
                            <p> <i class="fa fa-tags"></i><strong> 工程时间 : </strong>2017-10-10</p> 
                            <div class="image-clear"></div>
                        </div>
                    </article> <!-- /.post -->
                    
                <div style="height:100px;">
	                <div id="down" style="margin=300px; padding=100px;">
						 <canvas id="downCanvas" width="50" height="50">你的浏览器不支持canvas，请下载更新版本的浏览器
						 </canvas>
					 </div>
                </div>
                </div> <!-- /#content -->
            </div><!-- /row -->
        </div> <!-- /container -->
    <div class="row">
        <div class="span9">
            <br/><br/><br/>
            <br/><br/>
         </div>
    </div>

    <!-- FOOTER -->
    <footer id="footer">
        <div class="container">
            <div class="row">
                <!-- SOCIAL ICONS -->
                <div class="text-center">
                        <a href="index-demo.html#header">首页</a>
                    
                    |
                        <a href="news.html">新闻动态</a>
                    |
                         <a href="onlineDesign.html">在线设计 </a>
                    |
                        <a href="onlineDec.html">在线咨询</a>
                    |
                        <a href="Download.html">下载 </a>
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
	function drawDown() {
	    var c = document.getElementById("downCanvas"),
	    	cxt = c.getContext("2d");
	    cxt.beginPath();
	    cxt.moveTo(5, 20);
	    cxt.lineTo(25, 45);
	    cxt.lineTo(45, 20);
	    cxt.lineWidth = 5;
	    cxt.strokeStyle = "gray";
	    cxt.lineCap = 'round';
	    cxt.lineJoin = "round";
	    cxt.stroke();
	    cxt.moveTo(5, 5);
	    cxt.lineTo(25, 30);
	    cxt.lineTo(45, 5);
	    cxt.lineWidth = 5;
	    cxt.strokeStyle = "gray";
	    cxt.lineCap = 'round';
	    cxt.lineJoin = "round";
	    cxt.stroke();
	}
	drawDown()
	
	
</script>
</html>
