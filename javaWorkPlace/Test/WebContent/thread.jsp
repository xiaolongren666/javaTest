<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>水滴工作室</title>
<style type="text/css">
	body{ 
		margin: 0px;
	}
	#box{
		width:1700px;
		height:2000px;
		border:auto; 
	}
	a{text-decoration:none; }
		.shuidi{
			width:1200px;
			height:50px;
			margin-top: 23px; 
			border:auto ; 
			float: left;
			margin-left:250px;
		}
		.font_01
		{
			font-size:32px;
			font-style: black;
		} 
		.logo{margin-left: 20px;margin-top: 10px;  }
		.login{float: right;
			font-size:28px;
			margin-top:10px;
			margin-right: 40px;
			}
		    #box1{ width: 400px;    
		       margin: 55px auto;         
		       font-size: 14px;    } 
		  input{width: 260px;     
		       border: 1px solid #e2e2e2;      
		       height: 30px;                 
		        background-repeat: no-repeat;  
		        padding:0 0 0 40px;    }  
		    #search{ width: 78px;
		    	height: 32px;
		    	float: right;
		    	background: black;
		    	color: white; 
		    	 text-align: center;
		    	 line-height: 32px; 
		    	 cursor: pointer;    } 
		    .border{
		    	width: 1200px;
				height:800px;
				border: 3px solid black;  
			 	border-radius:10px 10px 10px 10px;
				margin: auto;}
			#box2{
				width:800px;
				height:750px;
				margin-top:5px;
				float:left;
				margin-left:2px;
				border:1px solid black;
				border-radius:5px 5px 5px 5px;
				position:absolute; 
			}
			#box3{
					width:750px;
					height:700px;
					margin-top:40px;
					float:left;
					margin-left: 30px; 
					border:1px solid black;
					border-radius:5px 5px 5px 5px;
					position:absolute;
				}
			#box4{
					width:280px;
					height:700px;
					margin-top:4px;
					float:left;
					margin-left:1000px;
					border:1px solid black;
					border-radius:5px 5px 5px 5px;
					position:absolute;
					
				}
			.style01{
				width:200px;
				height:50px;
				float:left;
				margin-left:30px;
				margin-top:7px;
				font-size:20px;
			}
			.style02{
				width:200px;
				height:50px;
				float:left;
				margin-left:35px;
				margin-top:7px;
				font-size:20px;
			}
			.style03{
				width:200px;
				height:50px;
				float:left;
				margin-left:40px;
				margin-top:7px;
				font-size:20px;
			}
			.class01{
				width:200px;
				height:50px;
				float:left;
				margin-left: 90px;
				margin-top: 7px; 
				font-size:30px;
			}
			.calss02{
				width:200px;
				height:50px;
				float:left;
				margin-left: 180px;
				margin-top: 7px;
				font-size:30px;
			}
			.calss03{
				width:200px;
				height:50px;
				float:left;
				margin-left: 270px;
				margin-top: 7px;
				font-size:30px;
			}
			.class04{
				width:200px;
				height:50px;
				float:left;
				margin-left:360px;
				margin-top: 7px;
				font-size:30px;
			}
			.class05{
				width:100px;
				height: 50px;
				float: left;
				margin-left: 80px;
				margin-top: 700px;
				font-size:20px;
			}	
			*{margin:0px; padding: 0px; }
		#dh{
			position: relative;
			margin-top: 0px;
			width: 1600px;
			height:40px;
			border: 0px;
			font-size:20px;
		}
		#dh ul{
			padding: 0px;
			
		}
		a{
			color: black;
			width: 100px;
			height: 40px;
			display: block;
			text-decoration: none;
			text-align: center;
			line-height: 40px;
			font-family: Microsoft Yahei;
			font-weight: 2px;
		}
		#dh {
			margin:0px auto; 
		}
		#dh ul li {
			list-style: none;
			float: left;
		}
		#dh ul li a:hover{
			background-color: #6699FF;
		}
		#dh ul:hover{
			display: block;
		}
		#dh ul li ul{
			background-color: #0099CC;
			position: absolute;
			display: none;
		}
		#dh ul li ul li{
			float: none;
			background-color: #6688EE;
			
		}
		#dh ul li ul li a{
			font-size: 13px;
			font-weight: 0px;
		}
		#dh ul li:hover ul{            
			display: block;
		}
</style>
</head>
<body>
<div id="box"> 
<div>
	    <div class="logo" >
			<img src="img/shuidi .png" width="360" height="130">
	  </div>
	<div class="shuidi" ">
		<div id="dh">
		<ul>
			<li><a href="${pageContext.request.contextPath }/second.jsp?name=${one_category.name}">${one_category.name}:课程</a></li>
			<li><a href="${pageContext.request.contextPath }/second.jsp?name=${one_category.name}">${one_category.name}:章节</a></li>
					<ul>
			             <li><a href="#">第一章</a></li>
						<li><a href="#">第二章</a></li>
						<li><a href="#">第三章</a></li>
					</ul>
				</li>
			<li><a href="#">小节</a>
					<ul>
						<li><a href="#">1.1</a></li>
						<li><a href="#">1.2</a></li>
						<li><a href="#">1.3</a></li>
					</ul>
			</li>
		</ul>
	</div>
		<div>
		<div id="box2">
		<div class="style01" color:yellow;>视频名称：</div>
		<div class="style02">发布作者：</div>
		<div class="style03">点击次数：</div>
		<div id="box3">
		</div>
		</div>
		<div id="box4">
			<button type="button" class="class05">发表</button>
		</div>
	<div id="box1">
	</div>
</div>
</div>
</body> 
</html> 
