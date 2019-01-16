<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//验证注册信息是否填写完整
	function check(){
		var id = document.getElementById("id").value;
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		//对ID、用户名、密码非空判断
		if(id == ""){
			alert("账号不能为空！");
			return false;
		}
		
		if(username == ""){
			alert("姓名不能为空！");
			return false;
		}
		
		if(password == ""){
			alert("密码不能为空！");
			return false;
		}
	return true;
	}
</script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div style="text-align:center;">
		<!-- 判断输出用户和密码是否不匹配 -->
		<c:if test="${not empty msg}">
			<c:out value="<div style='text-align:center; color:red;'>${msg}</div>" escapeXml="false">
			</c:out>
		</c:if>
		<h2>注册用户</h2>
		<hr/>
		<form action="RegisterServlet" method="post" onsubmit="return check()">
			账户：<input type="text" name="id" id="id" value="${id}"/><br/>
			姓名：<input type='text' name="username" id="username" value="${username}"/><br/>
			权限: <select name="authority" id="authority">
					<option value="0" selected>一般用户
					<option value="1">系统管理员
				  </select><br/>
			密码：<input type='text' name="password" id="password" value="${password}"/><br/>
			住址：<input type='text' name="address" id="address" value="${address}"/><br/>
			电话：<input type='text' name="phone" id="phone" value="${phone}"/><br/>
			<input type='submit' value="注册"/><br/>
		
		</form>
		<h2><a href="CheckServlet">用户明细</a></h2>
	</div>
</body>
</html>