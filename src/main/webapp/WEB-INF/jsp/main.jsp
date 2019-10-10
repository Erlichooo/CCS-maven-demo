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
		padding: 10px;
		}
		
		#content iframe {
			height: 100%;
			width: 100%;
		}
		</style>

		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
		<link href="css/main.css" rel="stylesheet">
		
		<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
		<script src="js/bootstrap/bootstrap.min.js"></script>
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
							<a href="#">首页</a>
						</li>
						<li>
							<a href="#">个人中心</a>
						</li>
						<li>
							<a href="travelInfo/selectTravelInfo" target="inCenter">车辆信息</a>
						</li>
						<li id="myBookInfo">
							<c:if test="${sessionScope.user==null }">
								<a href="user/toLogin">我的订单</a>
							</c:if>
							<c:if test="${sessionScope.user!=null }">
							<a href="bookInfo/selectBookInfo?id=${sessionScope.user.id }" target="inCenter">我的订单</a>
							</c:if>
						</li>
					</ul>
				</div>
				<div class="login-state" >
					<p>欢迎：<a href="user/toLogin" id="ls">${sessionScope.user.username }</a></p>
				</div>
				<div class="user">
					<%-- 欢迎：${sessionScope.user.username } --%>
				</div>
			</div>
		</nav>
		<div id="content">
			<iframe  src=""  name="inCenter" frameborder="0"></iframe>
		</div>
		<script>
			/* var login = $(".login-state").text().trim() */
			
			var user =${sessionScope.user.username }
			document.getElementById("ls").innerText=user
			if(user==null){//如果用户为登陆，动态添加“未登录”文本
				document.getElementById("ls").innerText="未登录"
			}
			
			/* if(login == "未登录"){
				$(".user").addClass("hidden")
			}else $(".user").removeClass("hidden") */
		</script>
	</body>

</html>