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
		
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
	</head>
	<body>
	<c:if test="${travelInfos.size() == 0 }">
		目前还没有可选择的车辆。
	</c:if>
	<c:if test="${travelInfos.size() != 0 }">
		<table border="1" bordercolor="PaleGreen">
			<c:forEach items="${travelInfos }" var="travelInfo" varStatus="status">
			<c:if test="${status.index == 0 }">
				<div class="container routeInfo">
			</c:if>
			<c:if test="${status.index != 0 }">
				<div class="container">
			</c:if>
			      <!-- Main component for a primary marketing message or call to action -->
			      <div class="routeInfo_below jumbotron">
			      	<div>
			        	<div class="departure">
			        		<h1>${travelInfo.startProvince}</h1>
							<h4>起点：${travelInfo.start}</h4>
							<h5>发布人：${travelInfo.ownerName}</h5>
							<h5>tel：${travelInfo.ownerTel}</h5>
			        	</div>
			        	<div class="direction_img">
			        		<img src="imges/direction.png" />
			        	</div>
			        	<div class="destination">
			        		<h1>${travelInfo.endProvince}</h1>
							<h4>终点：${travelInfo.end}</h4>
							<h5>时间:<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${travelInfo.date}" /></h5>
							<h5>预估航程时间:3h</h5>
			        	</div>
			        </div>
			        
			        <div class="bookingButton">
			        	<p>
							<a class="btn btn-lg btn-primary" href="bookInfo/toAddBookInfo?travelInfoId=${travelInfo.id }" target="inCenter" role="button">订票 &raquo;</a>
		        		</p>
			        </div>
			        
			        <div class="seatLeft">
			        		<h5>价格:${travelInfo.price }&nbsp&nbsp&nbsp&nbsp</h5>
			        		<h5>编号:${status.index+1 }</h5>
			        </div>
			      </div>
			    </div>
			</c:forEach>
		</table>
	</c:if>
	<script type="text/javascript">
	$("#bt1").attr("disabled",ture);
	</script>
	</body>
</html>