
    // ----------------------------------------------
    // 在线设计demo js
    // ----------------------------------------------

	jQuery(document).ready(function () {
	  jQuery("#jquery-accordion-menu").jqueryAccordionMenu();
	});

	$(function(){
	//顶部导航切换
	//floors(1);
	$("#demo-list li").click(function(){
	  $("#demo-list li.active").removeClass("active")
	  $(this).addClass("active");
	})
	})


	function  inputs(num) {
		layui.use('layer', function(){
		var layer = layui.layer;
			layer.prompt(function(val, index){
			  if(num=='1'){
			  layer.msg('用地面积：'+val);
			  layer.close(index);
			  }
			  else {
			    layer.msg('楼层数：'+val);
			    layer.close(index);
			  }
			}
		);
	});
	}

/*页面加载的js函数*/
	//隐藏按钮
	function disButton(str){
		var obj = document.getElementById(str);
		 //obj.className = "style2";
		 obj.setAttribute("class", "no");
		}

	//显示按钮
	function enButton(str){
		var obj = document.getElementById(str);
		 //obj.className = "style2";
		 obj.setAttribute("class", "layui-btn layui-btn-radius layui-btn-warm float-button");
	}

	//回退按钮
	function returns(str){
		if (str==null) return ;
		disButton('btnRtn');
		document.getElementById("Isome").style.visibility="hidden";
		document.getElementById("Eleva").style.visibility="hidden";
		document.getElementById("planDownLoad").style.visibility="hidden";
		if(str=='btnRtn'){
			getPlanPic();
		}
		if(str=='btnRtn2'){
			showElevation(1,planName,planId);
		}
	}

var area,floor;
	//获取所有符合筛选条件的方案
	function searchPlan(){
		$("#imgz").empty();
		area = document.getElementById("area").value;
		floor = document.getElementById("floor").value;
		document.getElementById("Isome").style.visibility="hidden";
		document.getElementById("Eleva").style.visibility="hidden";
		document.getElementById("planDownLoad").style.visibility="hidden";
		
		if(area==null || floor==null || trim(area)=="" || trim(floor)==""){
			alert("请输入建筑面积或建筑层数");
			return;
		}
		if(area>200){
			alert("您输入的建筑面积过大，系统无匹配方案,建议输入面积范围为30~200");
			return;
		}
		if(floor>6){
			alert("您输入的建筑楼层过高，系统中无匹配方案,建议输入建筑层数为2~6层");
			return;
		}
		 var styleText = $('#style option:selected').text();
		 if(styleText!= "传统"){
			 alert("不好意思，目前系统中仅能匹配到传统建筑风格,请更换您的建筑风格选项");
			 return;
		 }
		 return searchConfirm();
	}

	function searchConfirm(){
		var r = confirm("一键生成方案");
		if(r==true){
			getPlanPic();
		}else{
			return;
		}
	}
	var planName,planPicPath,level; //level表示图片查看层级
	/*使选中的图片放大显示*/
	function HugeImg(level,planName,planPicPath,planId){
		$("#imgz").empty();
		if(level==1){
			enButton('btnRtn');
			disButton('btnRtn2');
		}else if(level==2){
			disButton('btnRtn');
			enButton('btnRtn2');
			$("#btnRtn2").click(function(){
				showElevation(1,planName,planId);
			});
		}
		document.getElementById("imgz").style.height = "auto"; 
		$("#imgz").append(
			'<div class="layui-anim " style=" border:1px solid;flex:1; z-index:1" id="mainpic'+planId+'"><img src="/planImg/'+planName+"/"+planPicPath+'" alt="'+planName+'"" height="100%" width="100%"/></div>'
		);
		document.getElementById("Isome").style.visibility="visible";
		document.getElementById("Eleva").style.visibility="visible";
		document.getElementById("planDownLoad").style.visibility="visible";

		$("#Eleva").click(function(){     //生成立面图
			showElevation(1,planName,planId);
		});
		
		$("#Isome").click(function(){   //生成轴测图
			js_3D(planName);
		});
		
		
	}


	//一键生成方案
	function getPlanPic(){
		disButton('btnRtn');
		disButton('btnRtn2');
		$.ajax({
			type:"post",
			url:"../getPlan?area="+area+"&&floor="+floor+"",
			contentType:"application/json",
			success:function(data){
				$("#imgz").empty();
				document.getElementById("content_father").style.height="auto";
				if(data.length==0){
					alert("不好意思,系统中未找到匹配方案");
					return;
				}
				for(var i=0;i< data.length;){
					$("#imgz").append(
						'<div style=" border:1px solid;flex:1;display:flex;flex-direction:row">'+
						  '<div class="layui-anim" style=" border:1px solid;flex:1;" onClick=" HugeImg(1,\''+data[i].planName+'\',\''+data[i].planPicPath+'\','+data[i].planId+')" ><img src="/planImg/'+data[i].planName+"/"+data[i].planPicPath+'" alt="'+data[i].planName+'" height="100%" width="100%"/></div>'+
						  '<div class="layui-anim" style=" border:1px solid;flex:1;" onClick=" HugeImg(1,\''+data[i+1].planName+'\',\''+data[i+1].planPicPath+'\','+data[i].planId+')" ><img src="/planImg/'+data[i+1].planName+"/"+data[i+1].planPicPath+'" alt="'+data[i+1].planName+'" height="100%" width="100%"/></div>'+
						'</div>'
					);
					i+=2;
				}
			}
		});
	}
	
	//生成轴测图
	function js_3D(planName){
		$("#imgz").empty();
		$("#imgz").removeClass("gezi-background");
	//	document.getElementById("imgz").style.height = "500px"; 
		enButton('btnRtn');
		disButton('btnRtn2');
		$("#imgz").append(
				'<div class="carousel">'
				+'<figure>'
					+'<img src="/planImg/'+planName+'/西南轴测图.jpg" alt="">'
					+'<img src="/planImg/'+planName+'/西北轴测图.jpg" alt="">'
					+'<img src="/planImg/'+planName+'/东北轴测图.jpg" alt="">'
					+'<img src="/planImg/'+planName+'/东南轴测图.jpg" alt="">'
				+'</figure>'
				+'<nav>'
					+'<button class="nav prev layui-btn-radius layui-btn-warm" style="width:10%;left:0;margin:20px 20px;backgroundColor:darkgrey">Prev</button>'
					+'<button class="nav next layui-btn-radius layui-btn-warm" style="width:10%;left:0;margin:80px 20px;backgroundColor:darkgrey">Next</button>'
				+'</nav>'
			+'</div>'
		);
			var carousels = document.querySelectorAll('.carousel');
			for (var i = 0; i < carousels.length; i++) {
				carousel(carousels[i]);
			}
	}
	
	
	//生成立面图
	function showElevation(level,planName,planId){
		$("#imgz").empty();
		enButton('btnRtn');
		disButton('btnRtn2');
		document.getElementById("imgz").style.height = "auto"; 
		$("#imgz").append(
			'<div style="border:1px solid;flex:1;display:flex;flex-direction:row">'
			+'<div class="layui-anim " style="border:1px solid;flex:1;position:relative;width:100%;height:100%;" onclick="HugeImg(2,\''+planName+'\',\'东立面.jpg\','+planId+')"><img src="/planImg/'+planName+"/"+'东立面.jpg" alt="东立面"  height="100%" width="100%"/>'
			+'<div style="position:absolute;width:100%;height:100p%;z-indent:2;left:0;top:0;margin:20px 30px;">'
	        +'<h1 style="font-weight:15px;">东立面</h1>'
	        +'</div></div>'
	        +'<div class="layui-anim " style="border:1px solid;flex:1;position:relative;width:100%;height:100%;" onclick="HugeImg(2,\''+planName+'\',\'南立面.jpg\','+planId+')"><img src="/planImg/'+planName+"/"+'南立面.jpg" alt="南立面"  height="100%" width="100%"/>'
			+'<div style="position:absolute;width:100%;height:100p%;z-indent:2;left:0;top:0;margin:20px 30px;">'
	        +'<h1 style="font-weight:15px;">南立面</h1>'
	        +'</div></div>'
	        +'</div>'
			+'<div style="border:1px solid;flex:1;display:flex;flex-direction:row">'
			+'<div class="layui-anim " style="border:1px solid;flex:1;position:relative;width:100%;height:100%;" onclick="HugeImg(2,\''+planName+'\',\'西立面.jpg\','+planId+')"><img src="/planImg/'+planName+"/"+'西立面.jpg" alt="西立面"  height="100%" width="100%"/>'
			+'<div style="position:absolute;width:100%;height:100p%;z-indent:2;left:0;top:0;margin:20px 30px;">'
	        +'<h1 style="font-weight:15px;">西立面</h1>'
	        +'</div></div>'
	        +'<div class="layui-anim " style="border:1px solid;flex:1;position:relative;width:100%;height:100%;" onclick="HugeImg(2,\''+planName+'\',\'北立面.jpg\','+planId+')"><img src="/planImg/'+planName+"/"+'北立面.jpg" alt="北立面"  height="100%" width="100%"/>'
			+'<div style="position:absolute;width:100%;height:100p%;z-indent:2;left:0;top:0;margin:20px 30px;">'
	        +'<h1 style="font-weight:15px;">北立面</h1>'
	        +'</div></div>'
	        +'</div>'
		);
	}
	
	function carousel(root) {
		var figure = root.querySelector('figure'),
			nav = root.querySelector('nav'),
			images = figure.children,
			n = images.length,
			gap = root.dataset.gap || 0,
			bfc = 'bfc' in root.dataset,
			theta = 2 * Math.PI / n,
			currImage = 0;

		setupCarousel(n, parseFloat(getComputedStyle(images[0]).width));
		window.addEventListener('resize', function () {
			setupCarousel(n, parseFloat(getComputedStyle(images[0]).width));
		});

		setupNavigation();

		function setupCarousel(n, s) {
			var apothem = s / (2 * Math.tan(Math.PI / n));

			figure.style.transformOrigin = '50% 50% ' + -apothem + 'px';

			for (var i = 0; i < n; i++) {
				images[i].style.padding = gap + 'px';
			}for (i = 1; i < n; i++) {
				images[i].style.transformOrigin = '50% 50% ' + -apothem + 'px';
				images[i].style.transform = 'rotateY(' + i * theta + 'rad)';
			}
			if (bfc) for (i = 0; i < n; i++) {
				images[i].style.backfaceVisibility = 'hidden';
			}rotateCarousel(currImage);
		}

		function setupNavigation() {
			nav.addEventListener('click', onClick, true);

			function onClick(e) {
				e.stopPropagation();

				var t = e.target;
				if (t.tagName.toUpperCase() != 'BUTTON') return;

				if (t.classList.contains('next')) {
					currImage++;
				} else {
					currImage--;
				}

				rotateCarousel(currImage);
			}
		}

		function rotateCarousel(imageIndex) {
			figure.style.transform = 'rotateY(' + imageIndex * -theta + 'rad)';
		}
	}
