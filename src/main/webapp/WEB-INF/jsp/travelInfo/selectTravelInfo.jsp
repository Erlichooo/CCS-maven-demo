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
	<c:if test="${travelInfos.size() == 0 }">
		您还没有岗位。
	</c:if>
	<c:if test="${travelInfos.size() != 0 }">
		<table border="1" bordercolor="PaleGreen">
			<c:forEach items="${travelInfos }" var="travelInfo">
				<div class="container routeInfo">
			      <!-- Main component for a primary marketing message or call to action -->
			      <div class="routeInfo_below jumbotron">
			      	<div class="routeInfo_detail">
			        	<div class="departure">
			        		<h1>${travelInfo.startProvince}</h1>
							<h4>起点：${travelInfo.start}</h4>
							<h5><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${travelInfo.date}" /></h5>
			        	</div>
			        	<div class="direction_img">
			        		<img src="img/direction.png" />
			        	</div>
			        	<div class="destination">
			        		<h1>${travelInfo.endProvince}</h1>
							<h4>终点：${travelInfo.end}</h4>
							<h5>发布人：${travelInfo.ownerName}</h5>
							<h5>tel：${travelInfo.ownerTel}</h5>
			        	</div>
			        </div>
			        
			        <div class="bookingButton">
			        <p>
			          <a class="btn btn-lg btn-primary" href="../../components/#navbar" role="button">订票 &raquo;</a>
			        </p>
			        </div>
			        
			        <div class="seatLeft">
			        		<h5>价格：</h5>
			        		<h5>${travelInfo.price }</h5>
			        </div>
			      </div>
			    </div>
			</c:forEach>
		</table>
	</c:if>

	</body>
</html>