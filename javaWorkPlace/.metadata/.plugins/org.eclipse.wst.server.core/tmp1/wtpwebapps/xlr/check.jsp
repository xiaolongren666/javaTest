<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a,p,div,table{
		text-align:center;
	}
	table,tr,td{
		border:1px solid black;
	}
</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<form action="CheckServlet" method="post">
		<div style="position: relative;">
			姓名：<input type='text' name="username"/><br/>
			<div style="margin: auto;">
			权限：<select name="authority">
					<option value="0" >一般用户</option>	
					<option value="1" >管理员</option>
					<option selected>
				 </select>
			</div>
			住址：<input type='text' name="address"/><br/>
			电话：<input type='text' name="phone"/><br/>
			<input type='submit' name="检索"/><br/>
		</div>
	</form>
	<div>
			<table style="margin:auto;">
				<tr>
					<td colspan="7" style="text-align:center;">所有用户明细</td>
				</tr>
				<tr>
					<td>姓名</td>
					<td>权限</td>
					<td>住址</td>
					<td>电话</td>
					<td>修改</td>
					<td>删除</td>
				</tr>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.name}</td>
						<td>${user.authority}</td>
						<td>${user.address}</td>
						<td>${user.phone}</td>
						<td><a href="UpdateServlet?id=${user.id}&flag=experience">修改</a></td>
						<td><a href="DeleteServlet?id=${user.id}">删除</a></td>
					</tr>
				</c:forEach>
			</table>
	</div>
	<div>
		<h1><a href="register.jsp" style="color:#FF00FF">注册新用户</a></h1>
		<h1><a href="DownloadServlet">下载所有用户数据</a></h1>
	</div>
</body>
</html>