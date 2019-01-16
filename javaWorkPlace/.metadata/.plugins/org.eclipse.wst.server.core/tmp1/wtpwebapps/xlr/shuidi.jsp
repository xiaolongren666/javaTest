<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
.b {
	width: 48%;
	height: 100px;
	border: 10px;
	margin-top: 30px;
	float: left;
}

.bb {
	width: 100%;
	height: 100px;
}

.c {
	width: 100%;
	height: 300px;
}

.cc {
	width: 100%;
	height: 100px;
}

.ccc {
	width: 100%;
	height: 200px;
}

.d {
	width: 100%;
	height: 400px;
	text-align: center;
}

#box {
	width: 380px;
	margin: 30px auto;
	font-family: 'Microsoft YaHei';
	font-size: 14px;
}

input {
	width: 270px;
	border: 1px solid #e2e2e2;
	height: 30px;
	float: left;
	background-image: url(images/search.jpg);
	background-repeat: no-repeat;
	background-size: 25px;
	background-position: 5px center;
	padding: 0 0 0 40px;
}

#search {
	width: 60px;
	height: 32px;
	float: right;
	background: yellow;
	color: blue;
	text-align: center;
	line-height: 28px;
	cursor: pointer;
}

.q {
	width: 60%;
	height: 1800px;
}

.w {
	width: 20%;
	height: 1600px;
}

.yy {
	width: 150px;
	height: 200px;
	border: border:25px solid black;
	border-color: red;
	position: fixed;
}
</style>
</head>
<body>

	<div style="height: 1800px; width: 100%;">
		<table style="height: 1800px; width: 100%;">
			<tr style="height: 1800px; width: 100%;">
				<td class="q"></td>
				<td class="w">
					<div class="bb">
						<div class="b">
							<a href="#" style="font-size: 23px;">水滴教学</a>
						</div>

						<div class="b">
							<a href="#" style="float: right;">注册/登录</a>
						</div>
					</div>


					<div class="c">
						<div class="cc">
							<div id="box">
								<input type="text" name="search" placeholder="请输入关键字">
								<div id="search">搜索</div>
							</div>
						</div>

						<div class="ccc">
							<table class="ccc">
								<tr style="width: 100% height:65px;">
									<a href="#"><p style="font-size: 26px; margin-top: 0px;">Java方向：</p></a>
								</tr>
								<br>
								<tr style="width: 100% height:65px;">
									<a href="#"><p style="font-size: 26px; margin-top: 0px;">PHP建设：</p></a>
								</tr>
								<br>
								<tr style="width: 100% height:65px;">
									<a href="#"><p style="font-size: 26px; margin-top: 0px;">其他：</p></a>
								</tr>
							</table>
						</div>
					</div>
					<div class="yy">
						<img src="shuidi .png" />
					</div>
					<div class="d">
						<table class="d">
							<tr class="d">

								<p style="font-size: 30px; text-align: center;">
									<a href="#">Java视频</a>
								</p>


								<td width="33%" style="width: 33%; height: 400px;"><img
									src="hj.jpg" style="right: 100px;"></td>
								<td width="32%" style="width: 33%; height: 400px;"><img
									src="${pageContext.request.contextPath}/images/hj.jpg"></td>
								<td width="35%" style="width: 33%; height: 400px;"><img
									src="hj.jpg"></td>

							</tr>

						</table>

					</div>
					<div class="d">
						<table class="d">
							<tr class="d">

								<p style="font-size: 30px; text-align: center;">
									<a href="#">PHP视频</a>
								</p>


								<td style="width: 33%; height: 400px;"><img src="33.jpg"
									style="right: 100px;"></td>
								<td style="width: 33%; height: 400px;"><img src="33.jpg"">
								</td>
								<td style="width: 33%; height: 400px;"><img src="33.jpg">
								</td>

							</tr>

						</table>

					</div>
					<div class="d">
						<table class="d">
							<tr class="d">

								<p style="font-size: 30px; text-align: center;">
									<a href="#">其他视频</a>
								</p>


								<td style="width: 33%; height: 400px;"><img src="hj.jpg">
								</td>
								<td style="width: 33%; height: 400px;"><img src="hj.jpg">
								</td>
								<td style="width: 33%; height: 400px;"><img src="hj.jpg">
								</td>

							</tr>

						</table>

					</div>
				</td>
				<td class="q"></td>




			</tr>
		</table>
	</div>
</body>
</html>
