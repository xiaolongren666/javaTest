<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function test(){
		//获取输入框的值
		var id = document.getElementById("id").value;
		var password = document.getElementById("password").value;
		var f2 = false;
		var f1 = false;
		if(id !=""){
			f1=true;
		}else{
			f1=false;
		}
		
		if(password!=""){
			f2=true;
		}else{
			f2=false;
		}
		//判断三种情况
		if(f1 && f2){
			return true;
		}else{
			if(!f1 && !f2){
				document.getElementById("message").innerHTML="请输入账号和密码！";
			}else{
				if(!f1){
					document.getElementById("message").innerHTML="请输入账号！";
				}
				if(!f2){
					document.getElementById("message").innerHTML="请输入密码！";
				}
			}
			
			return false;
		}
	}
</script>
</head>
<body>
	<!-- 判断输出用户和密码是否不匹配 -->
	<c:if test="${not empty msg}">
		<c:out value="<div style='text-align:center; color:red;'>${msg}</div>" escapeXml="false">
		</c:out>
	</c:if>
	
	<div id="message" style="text-align:center; color:red;"></div>
	<form action="UserServlet" method="post" onsubmit="return test()" style="text-align:center;">
    	账号:<input type="text" id="id" name="id"/><br/>
		密码:<input type="text" id="password" name="password"/><br/>
		<input type="submit" value="登陆"/><br/>
    </form>
</body>
</html>