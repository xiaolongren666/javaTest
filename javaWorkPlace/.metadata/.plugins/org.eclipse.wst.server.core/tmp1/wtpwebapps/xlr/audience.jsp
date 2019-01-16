<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a{
		display:block;
		text-align:center;
		line-height:40px;
	}
</style>
</head>
<body>
<div style="text-align:center;">您好！${user.name}，欢迎光临我们的网站，您是第${count}位访问者</div>
<hr>
<div style="text-align:center;">一般用户菜单</div>
<a href="#">图书查询</a>
<a href="#">借书</a>
<a href="#">还书</a>
</body>
</html>