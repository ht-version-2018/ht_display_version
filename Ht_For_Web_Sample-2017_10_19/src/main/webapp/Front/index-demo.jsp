<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">

	<title>农房可视化在线互动系统（演示版）</title>
	
	<!-- Main CSS file -->
	<link rel="stylesheet" href="external/bootstrap/css/bootstrap.css" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/owl.carousel.css" />
	<link rel="stylesheet" href="css/magnific-popup.css" />
	<link rel="stylesheet" href="css/font-awesome.css" />
	<link rel="stylesheet" href="css/style.css" />
	<link rel="stylesheet" href="css/responsive.css" />
    <link rel="stylesheet" type="text/css" href="css-files/getCss.css" /> <!-- CSS: Our css :)  -->
    <script type="text/javascript" src="external/jquery-ui-1.8.21.custom.min.js"></script>  <!-- JS: effects core + fold and clip -->   
	<script type="text/javascript" src="js/jquery.min.js"></script><!-- jQuery -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script><!-- Bootstrap -->
	<script type="text/javascript" src="js/jquery.parallax.js"></script><!-- Parallax -->
	<script type="text/javascript" src="js/smoothscroll.js"></script><!-- Smooth Scroll -->
	<script type="text/javascript" src="js/masonry.pkgd.min.js"></script><!-- masonry -->
	<script type="text/javascript" src="js/jquery.fitvids.js"></script><!-- fitvids -->
	<script type="text/javascript" src="js/jquery.counterup.min.js"></script><!-- CounterUp -->
	<script type="text/javascript" src="js/waypoints.min.js"></script><!-- CounterUp -->
	<script type="text/javascript" src="js/jquery.isotope.min.js"></script><!-- isotope -->
	<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script><!-- magnific-popup -->
	<style>
		
		.st-testimonials p{
			color:black;
			font-style:inherit;
		}
		.col-md-12{
			height:70px;
		}
		
		 .arrow {
            position: absolute;
            z-index: 9999;
            margin-top:150px;
            padding-top:20px;
            width: 30px;
            font-size: 40px;
            font-weight: bold;
            height:60px;
            text-align: center;
            color: #fff;
            background-color: RGBA(0, 0, 0, .3);
            cursor: pointer;
        }
        
        .arrow:hover {
        	color:#fff;
            background-color: RGBA(0, 0, 0, .7);
        }
        
        .testimonial:hover .arrow {
            display: block;
        }
        
        #prev {
            left: 20px;
        }
        
        #next {
            right: 20px;
        }  
	</style>	
</head>
<body>

	<jsp:include page="head.jsp"></jsp:include>

	<!-- SLIDER -->
	<section id="slider">
		<div id="home-carousel" class="carousel " data-ride="carousel">			
			<div class="carousel-inner">
				<div class="item active" style="background-image: url(images/index/index-header/01.jpg)">
					<div class="carousel-caption container" style="background-color:rgba(0,0,0,0);">

						<div class="row">
							<div class="col-sm-8">
								<br/><br/>
								<h2>宁波市住建委“一村一档”管理系统</h2>
								<h1>宁波市农房工业化研究中心</h1>
								<h2>宁波工程学院</h2>
							</div>
						</div>
						<img class="headerImg" src="images/index/image006.jpg" style="border:10px solid white;height:350px;"></img>
					</div>					
				</div>
			</div>		
		</div> <!--/#home-carousel--> 
    </section>
	<!-- /SLIDER -->

	<!-- SERVICES -->
	<section id="services" style="padding-top:50px;">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
						<h2>企业及平台介绍</h2>
						<span class="st-border"></span>
					</div>
				</div>
				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-desktop"></i> 企业宗旨</h2>
					<p>本团队全面、系统、持续地研究宁波建筑工业化，为宁波建筑工业化的健康发展和宁波城乡人居环境的改善做出积极的贡献。</p>
				</div>
				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-cogs"></i> 企业概况</h2>
					<p>建筑工业化设计团队拥有一支高职称、高学历并具有较强工程应用背景的教师队伍，所有教师均具备硕士以上学位并具备丰富的建筑设计经验。</p>
				</div>

				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-code"></i> 企业经营领域等</h2>
					<p>本团队带头人陈镜丞老师，先后主持完成了20余项横向纵向科研项目，主编了《宁波市住宅工业化标准体系图集》、《宁波市农房工业化标准体系图集》等地方建筑工业化标准。</p>
				</div>

				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-dashboard"></i> 平台介绍</h2>
					<p>该团队全面、系统、持续地研究宁波建筑工业化，为宁波建筑工业化的健康发展和宁波城乡人居环境的改善做出积极的贡献。</p>
				</div>

				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-life-ring"></i> 平台功能</h2>
					<p>本平台面向所有客户群体，对农房、公共建筑等按要求进行自主设计，通过与专业设计人员的沟通交流、修改设计，完成工业化装配式建筑设计方案，并下单工厂生产预制化构配件、预约工人安装建造，后期保修服务等一系列功能。</p>
				</div>

				<div class="col-md-4 col-sm-6 st-service">
					<h2><i class="fa fa-flag-o"></i> 平台发展前景等</h2>
					<p>本团队与同济大学、东南大学等多个知名大学建立合作关系，与宁波普利凯建筑科技有限公司、远大集团、万科集团等多个建筑工业化龙头企业建立合作关系。</p>
				</div>
			</div>
		</div>
	</section>
	<!-- /SERVICES -->
	

	<!-- OUR WORKS -->
	<section id="our-works">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
						<h2>试点工程</h2>
						<span class="st-border"></span>
					</div>
				</div>

				<div class="portfolio-wrapper" >
					
					<div class="portfolio-items">
						
						<div class="col-md-4 col-sm-6 work-grid ningbo show">
							<div class="portfolio-content">
								<img class="img-responsive" src="images/test-prj/portfolio-1.jpg" alt="">
								<div class="portfolio-overlay" onclick="window.open('projectDetail.jsp?projectId=2');">
									<a href="images/test-prj/portfolio-1.jpg"><i class="fa fa-camera-retro"></i></a>
									<h5>解危住宅</h5>
									<p>地点：江北裘市村</p>
								</div>
							</div>	
						</div>
						
						<div class="col-md-4 col-sm-6 work-grid xiangshan show">
							<div class="portfolio-content">
								<img class="img-responsive" src="images/test-prj/portfolio-2.jpg" alt="">
								<div class="portfolio-overlay" onclick="window.open('projectDetail1.jsp?projectId=1');">
					 				<a href="images/test-prj/portfolio-2.jpg"><i class="fa fa-camera-retro"></i></a>
									<h5>村民活动中心</h5>
									<p>地点：奉化大埠村</p>
								</div>
								</a>
							</div>	
						</div>

						<div class="col-md-4 col-sm-6 work-grid fenghua show">
							<div class="portfolio-content">
								<img class="img-responsive" src="images/test-prj/portfolio-3.jpg" alt="">
								<div class="portfolio-overlay" onclick="window.open('projectDetail2.jsp?projectId=3');">
									<a href="images/test-prj/portfolio-3.jpg"><i class="fa fa-camera-retro"></i></a>
									<h5>村民安置房</h5>
									<p>地点：象山莲花村</p>
								</div>
							</div>	
						</div>
					</div>
				</div>
						<div><a class="btn btn-small" href="project.jsp" style="float:right;margin-right:15px;">查看全部</a></div>
			</div>
		</div>
	</section>
	<!-- /OUR WORKS -->

		<div class="container">
			<div class="row">
			<div class="col-md-12">
					<div class="section-title">
						<h2>案例展示</h2>
						<span class="st-border"></span>
					</div>
			</div>
		</div></div>
	
	<!-- 轮播 -->
	<!-- TESTIMONIAL -->
	<section>
		<div class="container">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
						<!-- 轮播一 -->
						<div class="item active">
							<div class="portfolio-wrapper text-center" >
								<div class="col-sm-6 our-office-img">
									<div style="height:350.56px;">
										<img src="images/index/index-caseShow/01.jpg" alt="">
								 	</div>		
								</div>
								<div class="col-sm-6 our-office-als">
							<div class="about-us" style="padding-top:0px;margin-left:85px;">
								<div class="data_case">
									<h3><strong>案例效果一</strong></h3>
									<h4>成套农房  3层   230m²</h4>
									<p>宅基地面积124㎡</p>
									<p>预制混凝土体积 254.41m³</p>
									<p>现浇混凝土体积 107.04m³</p>
									<p>预制率：70.39％</p>
									<p>装配率：100％</p>
								<br/>
								</div>
							</div>
								</div>
						</div>
						</div>

						<!-- 轮播二 -->
						<div class="item">
							<div class="portfolio-wrapper text-center" >
								<div class="col-sm-6 our-office-img">
										<div style="height:350.56px;">
								<img src="images/index/index-caseShow/02.jpg" alt="">
										</div>		
								</div>
								<div class="col-sm-6 our-office-als">
							<div class="about-us" style="padding-top:0px;margin-left:85px;">
								<div class="data_case">
									<h3><strong>案例效果二</strong></h3>
									<h4>成套农房  3层   230m²</h4>
									<p>宅基地面积124㎡</p>
									<p>预制混凝土体积 254.41m³</p>
									<p>现浇混凝土体积 107.04m³</p>
									<p>预制率：70.39％</p>
									<p>装配率：100％</p>
								<br/>
								</div>
								</div>
							</div>
						</div>
				</div>
			
					<!-- 轮播三-->
						<div class="item">
							<div class="portfolio-wrapper text-center" >
								<div class="col-sm-6 our-office-img">
										<div style="height:350.56px;">
								<img src="images/index/index-caseShow/03.jpg" alt="">
										</div>		
								</div>
								<div class="col-sm-6 our-office-als">
							<div class="about-us" style="padding-top:0px;margin-left:85px;">
								<div class="data_case">
									<h3><strong>案例效果三</strong></h3>
									<h4>成套农房  3层   230m²</h4>
									<p>宅基地面积98㎡</p>
									<p>预制混凝土体积 207.71m³</p>
									<p>现浇混凝土体积 97.04m³</p>
									<p>预制率：56.39％</p>
									<p>装配率：100％</p>
								<br/>
								</div>
								</div>
							</div>
						</div>
				</div>
				
					<!-- 轮播四-->
						<div class="item">
							<div class="portfolio-wrapper text-center" >
								<div class="col-sm-6 our-office-img">
										<div style="height:350.56px;">
								<img src="images/index/index-caseShow/04.jpg" alt="">
										</div>		
								</div>
								<div class="col-sm-6 our-office-als">
							<div class="about-us" style="padding-top:0px;margin-left:85px;">
								<div class="data_case">
									<h3><strong>案例效果四</strong></h3>
									<h4>成套农房  3层   260m²</h4>
									<p>宅基地面积130㎡</p>
									<p>预制混凝土体积 267.51m³</p>
									<p>现浇混凝土体积 127.44m³</p>
									<p>预制率：75.39％</p>
									<p>装配率：95％</p>
								<br/>
								</div>
								</div>
							</div>
						</div>
				</div>
				
					<!-- 轮播五-->
						<div class="item">
							<div class="portfolio-wrapper text-center" >
								<div class="col-sm-6 our-office-img">
										<div style="height:350.56px;">
								<img src="images/index/index-caseShow/05.jpg" alt="">
										</div>		
								</div>
								<div class="col-sm-6 our-office-als">
							<div class="about-us" style="padding-top:0px;margin-left:85px;">
								<div class="data_case">
									<h3><strong>案例效果五</strong></h3>
									<h4>成套农房  3层   2100m²</h4>
									<p>宅基地面积114㎡</p>
									<p>预制混凝土体积 234.41m³</p>
									<p>现浇混凝土体积 137.04m³</p>
									<p>预制率：83.39％</p>
									<p>装配率：93％</p>
								<br/>
								</div>
								</div>
							</div>
						</div>
				</div>
			<!-- 轮播（Carousel）导航 -->
				<a class="carousel-control left" href="#myCarousel" data-slide="prev" style="margin-top:150px;width:5%;font-size:35px;">&lsaquo;</a>
				<a class="carousel-control right" href="#myCarousel" data-slide="next" style="margin-top:150px;width:5%;font-size:35px;">&rsaquo;</a>
			</div>
		</div>
	</section>
	<!-- /TESTIMONIAL -->
	
	<!-- 轮播 -->
	
	<!-- PRICING -->
	<section id="pricing" style="background:rgb(245,245,245);padding-bottom:30px;">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
						<h2>合作企业</h2>
						<span class="st-border"></span>
					</div>
				</div>

				<div class="col-sm-3">
					<div class="st-pricing text-center">
						<div class="team-member member-image">
						<div class="">
							<img class="img-responsive" src="images/index/index-commpany/pulikai.jpg"style="height:200px;width:300px;">
							<div class="member-social">
								<a href="http://www.preca.cn/" target="_blank"><i class="fa fa-paw"> 点击访问官网</i></a>
							</div>
						</div>
					</div>
						<div class="st-border"></div>
						<ul>
							<h4 style="margin:0px;">宁波普利凯建筑科技<br/>有限公司</h4>
							<br/>
							<p>Ningbo Preca Construction <br/>Technology Co. LTD.</p>
						</ul>
						<!-- <a href="" class="btn btn-send">Sign Up</a> -->
					</div>
				</div>

				<div class="col-sm-3">
					<div class="st-pricing text-center">
						<div class="team-member member-image">
						<div class="">
							<img class="img-responsive" src="images/index/index-commpany/haida.jpg"style="height:200px;width:300px;">
							<div class="member-social">
								<a href="http://www.haida-cn.com/main.asp" target="_blank"><i class="fa fa-paw"> 点击访问官网</i></a>
							</div>
						</div>
					</div>
						<div class="st-border"></div>
						<ul>
							<h4 style="margin:0px;">宁波海达远大建筑工业<br/>有限公司</h4>
							<br/>
							<p>Ningbo Haida <br/>Construction Co. LTD.</p>
							<br/>
						</ul>
						<!-- <a href="" class="btn btn-send">Sign Up</a> -->
					</div>
				</div>
				
				<div class="col-sm-3">
					<div class="st-pricing text-center">
						<div class="team-member member-image">
						<div class="">
							<img class="img-responsive" src="images/index/index-commpany/jiaochuan.jpg" style="height:200px;width:300px;">
							<div class="member-social">
								<a href=" http://u68713010.b2bname.com/" target="_blank"><i class="fa fa-paw"> 点击访问官网</i></a>
							</div>
						</div>
					</div>
						<div class="st-border"></div>
						<ul>
							<h4 style="margin:0px;">宁波蛟川构件<br/>有限公司</h4>
							<br/>
							<p>Ningbo Jiaochuan Electronics<br/>Co. LTD.</p>
						</ul>
						<!-- <a href="" class="btn btn-send">Sign Up</a> -->
					</div>
				</div>

				<div class="col-sm-3">
					<div class="st-pricing text-center">
						<div class="team-member member-image">
						<div class="">
							<img class="img-responsive" src="images/index/index-commpany/xinjie.jpg" style="height:200px;width:300px;">
							<div class="member-social">
								<a href="http://www.xinjiejs.com/" target="_blank"><i class="fa fa-paw"> 点击访问官网</i></a>
							</div>
						</div>
					</div>
						<div class="st-border"></div>
						<ul>
							<h4 style="margin:0px;">浙江欣捷建设<br/>有限公司</h4>
							<br/>
							<p>Ningbo Xinjie <br/>Swift Co. LTD.</p>
							<br/>
						</ul>
						<!-- <a href="" class="btn btn-send">Sign Up</a> -->
					</div>
				</div>
				
			</div>
		</div>
	</section>
	<!-- /PRICING -->
	
	<!-- CONTACT -->
	<section id="contact" style="padding-bottom: 50px;">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
						<h2>联系我们</h2>
						<span class="st-border"></span>
					</div>
				</div>

				<div class="col-sm-1 ">
				</div>
				<div class="col-sm-9 contact-info">
					<p class="contact-content"></p>		
						<p class="st-phone"><i class="fa fa-mobile"></i> <strong> 电话： </strong> 000-000-000</p>
						<p class="st-email"><i class="fa fa-envelope-o"></i> <strong>邮箱：</strong> email@email.com</p>
						<p class="st-website"><i class="fa fa-globe"></i> <strong>官网：</strong> www.yourwesiete.com</p>
						<p class="st-address"><i class="fa fa-map-marker"></i> <strong> 地址： </strong> 宁波市江北区风华路 201号 宁波工程学院 建筑与交通工程学院大楼 B310</p>

				</div>
			</div>
		</div>
	</section>
	<!-- /CONTACT -->

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
	
</body>
<script type="text/javascript">
$(document).ready(function(){ 
	$('#myCarousel').carousel({interval:2500});//每隔2.5秒自动轮播 
}); 
</script>
</html>