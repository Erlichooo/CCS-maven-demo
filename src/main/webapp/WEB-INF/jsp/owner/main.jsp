<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
		<meta name="description" content="">
		<meta name="author" content="">

		<title>订票首页</title>
		
		<style type="text/css">
		* {
			margin: 0px;
			padding: 0px;
		}
		html,body{
             width: 100%;
             height: 100%;
        }
		#content {
		height: 100%;
		width: 100%;
		overflow:hidden;
		padding: 0px;
		}
		
		#content iframe {
			height: 100%;
			width: 100%;
		}
		</style>
		
		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
		<link href="css/main.css" rel="stylesheet">
		
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script src="js/bootstrap/bootstrap.min.js"></script>
	</head>

	<body>
		
		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
			<div class="container">
				<div class="dropdown layout">
					<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
	    菜单
	    <span class="caret"></span>
	  </button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li>
							<a href="owner/toMain">首页</a>
						</li>
						<li>
							<a href="#" style="text-decoration: line-through;">个人中心</a>
						</li>
						<li>
							<a href="travelInfo/selectTravelInfo" target="inCenter">车辆信息</a>
						</li>
						<li>
							<a href="travelInfo/toAddTravelInfo" target="inCenter">发布车程</a>
						</li>
						<li>
							<a href="travelInfo/selectTravelInfoById?id=${sessionScope.owner.id }" target="inCenter">已发布的车程</a>
						</li>
					</ul>
				</div>
				<div class="login-state" >
					<p>欢迎：<a href="owner/toLogin" id="ls">${sessionScope.owner.username }</a></p>
				</div>

			</div>
		</nav>
		<div id="content" class="theme">
			<iframe  src="user/toHomepage" seamless="seamless" name="inCenter" frameborder="0"></iframe>
		</div>
	</body>

</html>