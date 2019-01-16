<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
			height: 34px;
			font-size: 1.1em;
			color: white;
			line-height: 35.5px;
			background:#38f;
			border: none;
			}	
			input{float: left;}
			.border{height: 150px;
			width: 760px;
			border:1.5px solid #C0C0C0;
			}
		   .border li{list-style: none;
		    float: left;
		   }
		   .border a{text-decoration: none; 
		   margin-left: 60px;
		   }
		   .border1{height: 30px;
		   width: 760px;
		   line-height: 30px;
		   color: #0000FF;
		   }
		   .border2{height: 390px;
		   width: 760px;
		   border: 1px solid black;
		   }
		   .Java{width: 90px;
		   height: 36px;
		   font-size: 1.1em;
		   color: #0000FF; 
		   margin-left: 340px;
		   }
		   .PHP{width: 90px;
		   height: 36px;
		   font-size: 1.1em;
		   color: #0000FF; 
		   margin-top: 190px;
		   margin-left: 340px; 
		   }
		   .Python{width: 120px;
		   height: 36px;
		   font-size: 1.1em;
		   color: #0000FF; 
		   margin-top:190px;
		   margin-left: 340px; 
		   }
		   .border3{width: 180px;
		   height: 150px;
		   border: 1px solid black;
		   margin-left:55px ;
		   }
		   .border4{width: 180px;
		   height: 30px;
		   margin-left: 55px;
		   line-height: 30px;
		   font-size: 1.1em;
		   text-align: center;
		   }      
		</style>
</head>
<body>
 <div class="w top">
			    <div class="logo">
						<img src="img/shuidi .png" width="280px" height="100px">
			    </div>
			    <div class="search">
			    <form action="SearchServlet" method="post">
			        <input type="text" class="search-txt" placeholder="请输入关键字">
			        <input type="submit" class="search-sub" value="搜索" >
			        </form>
			    </div>	
		    </div>
		    <br>  
		    <div class="w border">
		    <c:forEach items="${one_categorys}" var="one_category">		    
		    			<br>
		    		<a href="${pageContext.request.contextPath }/second.jsp?name=${one_category.name}" style="font-size:26px;margin-top:0px;">${one_category.name}:</a>
		    		
		    		  <c:forEach items="${two_categorys}" var="two_category">
		    		  <c:if test="${one_category.id==two_category.belong }">
		    
		    		<a href="${pageContext.request.contextPath }/second.jsp?name=${two_category.name}" style="font-size:20px;">
		    		&nbsp;&nbsp;${two_category.name }</a>
		    	
		    		</c:if>
		    		</c:forEach>
		    
		    	</c:forEach>
		    </div> <!--分类框-->
		    <div class="w border1">推荐视频</div>
		    <c:forEach items="${one_categorys}" var="one_category">
		    	<div class="w border2">
		    		 <div class="Java">
		    		    <a href="${pageContext.request.contextPath }/second.jsp?name=${one_category.name}">${one_category.name}视频</a> 
		  	    	 </div>
			    	 <c:forEach items="${audios}" var="audio">
			       		<c:if test="${audio.flag==1 && one_category.id==audio.belong}">
			    		<div class="border3 fl">
			    		<a href="${pageContext.request.contextPath}/course.jsp?name=${audio.name}">
			    			<video width="180" height="240" controls="controls">
			 										 <source src="${audio.path1}.mp4" type="video/mp4" />
			  										 <source src="${audio.path1}.ogg" type="video/ogg" />
			  										 <source src="${audio.path1}.webm" type="video/webm" />
							 </video>
							 <p>${audio.name}</p>							
			    		</a>
			    		</div>
			    	</c:if>
			    	</c:forEach>
		    	</div>
		    	</c:forEach>

</body>
</html>