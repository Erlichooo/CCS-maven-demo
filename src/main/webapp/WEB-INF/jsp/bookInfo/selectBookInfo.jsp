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
		<style type="text/css">
		* {
			margin: 0px;
			padding: 0px;
		}
		html,body{
             width: 100%;
             height: 100%;
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
	<div class="container">
			      <!-- Main component for a primary marketing message or call to action -->
		<div class="jumbotron">
		<center>
			<c:if test="${bookInfos.size() == 0 }">
				您目前还没有订单。
			</c:if> 
			<c:if test="${bookInfos.size() != 0 }">
				<table border="1" bordercolor="PaleGreen">
					<tr>
						<th width="50px">ID</th>
						<th width="100px">姓名</th>
						<th width="200px">联系方式</th>
						<th width="50px">线路</th>
					</tr>
					<c:forEach items="${bookInfos }" var="bookInfo">
						<tr onmousemove="changeColor(this)" onmouseout="changeColor1(this)">
							<td>${bookInfo.id }</td>
							<td>${bookInfo.name }</td>
							<td>${bookInfo.tel }</td>
							<td><a href="travelInfo/selectATravelInfo?id=${bookInfo.travelInfoId }" target="_blank">详情</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
		</center>
		</div>
	</div>

	</body>
</html>