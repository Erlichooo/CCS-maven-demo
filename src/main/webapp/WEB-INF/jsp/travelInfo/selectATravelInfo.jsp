<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
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

		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
		<link href="css/booking.css" rel="stylesheet">
		
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	</head>
	<body>
		<div class="container">
			<!-- Main component for a primary marketing message or call to action -->
			<div class="routeInfo_below jumbotron">
				<div class="routeInfo_detail">
					<div class="departure">
						<h1>${travelInfo.startProvince}</h1>
						<h4>起点：${travelInfo.start}</h4>
						<h5>发布人：${travelInfo.ownerName}</h5>
						<h5>tel：${travelInfo.ownerTel}</h5>
					</div>
					<div class="direction_img">
						<img src="imges/direction.png" />
					</div>
<%-- 					<div class="CountNum">
						目前订票人数为：<h5>15</h5>
					</div>
					<div class="price">
						售价：<h5>${travelInfo.price}</h5>
					</div> --%>
					<div class="destination">
						<h1>${travelInfo.endProvince}</h1>
						<h4>终点：${travelInfo.end}</h4>
						<h5>时间:<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${travelInfo.date}" /></h5>
						<p><h5>售价：${travelInfo.price}</h5>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>