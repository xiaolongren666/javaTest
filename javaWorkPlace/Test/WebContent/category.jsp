<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>水滴工作室</title>
		<style type="text/css">
		.w{width:1280px;
			margin: 0 auto;
			}
			 .border2{height: 700px;
		   width: 760px;
		   border: 1px solid black;
		   }	
	   </style>
</head>
<body>
<% 
String name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
request.setAttribute("name", name);	
%>
<c:out value="欢迎来到${name }类别" default="加载类别失败"/>
		    <div class="w border2">
		    			<video width="320" height="240" controls="controls">
		 										 <source src="video/qwe.mp4" type="video/mp4" />
		  										 <source src="video/qwe.ogg" type="video/ogg" />
		  										 <source src="video/qwe.webm" type="video/webm" />
											  </video>
											  <p>${audio.name}</p>							
		    	</div>
</body>
</html>