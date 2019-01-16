<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>水滴工作室</title>
		<style type="text/css">
			*{padding: 0px;
			margin: 0px;	
			}
			.fl{float: left;}
			.fr{float: right;}
			.w{width:1280px;
			margin: 0 auto;
			}
			.top{height: 180px;
			border: none;
			position: relative;
			}
			.logo{height: 100px;
			width: 280px;
			}
			.search{width: 536px;
			height: 37px;
			position: absolute;
			left: 370px;
			top:140px;
			}
			.search .search-txt{width:450px;
			height: 34px;
			color: #ccc;
			}
			.search .search-sub{
			width: 80px;
			height: 36px;
			font-size: 1.1em;
			color: white;
			line-height: 35.5px;
			background:#38f;
			border: none;
			}	
			input{float: left;}
			.border1{height: 30px;
		    width:540px;
		    border: none;
		    line-height: 30px;
		    }
			.background{width: 1280px;
			height: 35px;
			background: #CCCCCC;
			}  
			.dropdown{position: relative;
			left: 370px;
			display: inline-block;
			
			}
			.dropdown-content{display: none;
			position: absolute;
			background-color: #f9f9f9;
			min-width: 160px;
			box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
			padding: 12px 16px;
			}
			.dropdown-content a {
		    color: black;
		    padding: 12px 16px;
		    text-decoration: none;
		    display: block;
		    }
			.dropdown:hover .dropdown-content {
            display: block;
            }
            .span-style{font-size: 15px;
            line-height: 35px;
     
            }
             .span-style1{font-size: 15px;
            line-height: 35px;
            margin-left: 400px;
            }
             .span-style2{font-size: 15px;
            line-height: 35px;
            margin-left: 30px;
            }
			.border2{width: 1100px;
			height: 180px;
			border: none;
			margin: 20px auto;
			}
			.border3{width: 250px;
			height: 180px;
			border: none;
			}
			.border4{width: 650px;
			height: 180px;
			border: none;
			font-size: 20px;
			
			}
			.word-style1 a{font-size: 23px;
			color: black;
			margin-left: 30px;
			text-decoration: none;
			}
			.word-style2{font-size: 15px;
			color: blueviolet;
			margin-left: 30px;
			margin-top: 25px;
				
			}
			.word-style3{font-size: 15px;
			color: black;
			margin-top:25px;
			margin-left: 30px;
			}
		    .border5{width:200px;
		    height: 180px;
		    border: none;	
		    }
		    .word-style4{font-size: 15px;
		    color:blue;
		    margin-left: 40px;
		    }
		    .border6{width: 110px;
		    height: 45px;
		    border: none;
		    background-color: #0a5ebe;
		    text-align: center;
		    margin-top: 50px;
		    margin-left: 80px;
		    
		    }
		    .border6 a{font-size: 18px;
		    color: white;
		    line-height: 45px;
		    text-decoration: none; 
		    }	
        </style> 
</head>
<body>
	    <div class="w top">
		    <div class="logo">
				<a href="#" target="_blank">
		    		<img src="img/shuidi .png" width="280px" height="100px">
		    	</a>
			</div>
		<div class="search">
		     <form action="SearchServlet" method="post">
		        <input type="text" class="search-txt" placeholder="请输入关键字">
		        <input type="submit" class="search-sub" value="搜索" >
		         </form>
		    </div>	
	    </div>   <!-- logo和搜索栏-->
	    <div class="w background">
	    	<div class="dropdown">
	    		<span class="span-style">全部分类</span>
	    		<div class="dropdown-content">
		    			<p><a target="_blank" href="#">Java</a></p>
		    			<p><a target="_blank" href="#">PHP</a></p>
		    			<p><a target="_blank" href="#">Python</a></p>	
	    		</div>
	    	</div>
	    	    <span class="span-style1">热门视频</span>
	    	    <span class="span-style2">历史观看</span>
	    </div>
		<div class="w border2">
			<div class="border3 fl">
					<div class="border3 fl">
				<a target="_blank" href="${pageContext.request.contextPath }/thread.jsp?name=${one_category.name}">
				   <% 
String name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
request.setAttribute("name", name);	
%>
<c:out value="欢迎来到${name }类别" default="加载类别失败"/>
		    <div class="w border2">
		    			<video width="300" height="180" controls="controls">
		 										 <source src="video/qwe.mp4" type="video/mp4" />
		  										 <source src="video/qwe.ogg" type="video/ogg" />
		  										 <source src="video/qwe.webm" type="video/webm" />
											  </video>
											  <p>${audio.name}</p>							
		    	</div>
				</a>
			</div> 
			</div>  
			<div class="border4 fl">
				<div class="word-style1">
					<a target="_blank" href="#">Java Web技术及应用</a>
				</div>
                <div class="word-style2">
                	讲师：冯娟娟&nbsp;&nbsp;   
                	开课时间 - 2015/01/01
                </div>
                <div class="word-style3">本课程由理论到实践对Java Web技术进行系统讲解，强调实用性和动手操作能力，
                	全面提高分析问题、解决问题以及实际项目的编码能力。
                </div>
			</div>
			<div class="border5 fl">
				<span class="word-style4">所属机构：水滴工作室</span>
				<div class="border6">
				  <a target="_blank" href="${pageContext.request.contextPath }/thread.jsp?name=${one_category.name}">查看课程</a>
			    </div>
			</div>
		</div> 
		<hr/>
		<div class="w border2">
			<div class="border3 fl">
				<a target="_blank" href="#">
				    <img src="img/6.jpg" width="250px" height="180px">
				</a>
			</div>  
			<div class="border4 fl">
				<div class="word-style1">
					<a target="_blank" href="#">Java 基础</a>
			    </div>
                <div class="word-style2">
                	讲师：冯娟娟&nbsp;&nbsp;   
                	开课时间 - 2015/01/01
                </div>
                <div class="word-style3">本课程由浅入深对 Java SE 技术进行系统讲解，强调动手操作能力，
                	以项目贯穿的形式，使得学习者能够全面提高分析问题、解决问题以及动手编码的能力。
                </div>
			</div>
			<div class="border5 fl">
				    <span class="word-style4">所属机构：水滴工作室</span>
				    <div class="border6">
				         <a target="_blank" href="${pageContext.request.contextPath }/thread.jsp?name=${one_category.name}">查看课程</a>
		            </div>
			</div>
		</div> 
		<hr/>
		<div class="w border2">
			<div class="border3 fl">
				<a target="_blank" href="#">
				    <img src="img/5.jpg" width="250px" height="180px">
				</a>
			</div>  
			<div class="border4 fl">
				<div class="word-style1">
					<a target="_blank" href="#">Java</a>
			    </div>
                <div class="word-style2">
                	讲师：冯娟娟&nbsp;&nbsp;   
                	开课时间 - 2015/01/01
                </div>
                <div class="word-style3">本课程由浅入深对 Java SE 技术进行系统讲解，强调动手操作能力，
                	以项目贯穿的形式，使得学习者能够全面提高分析问题、解决问题以及动手编码的能力。
                </div>
			</div>
			<div class="border5 fl">
				    <span class="word-style4">所属机构：水滴工作室</span>
				    <div class="border6">
				        <a target="_blank" href="${pageContext.request.contextPath }/thread.jsp?name=${one_category.name}">查看课程</a>
		            </div>
			</div>
		</div> 
		<hr/>
	</body>
</html>