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

		<title>购票</title>

		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">
		<link href="css/booking.css" rel="stylesheet">

		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>

		<script src="js/bootstrap/bootstrap.min.js"></script>
		<script src="js/jquery.validate.min.js"></script>
		<script src="js/messages_zh.js"></script>
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>
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
						<img src="imges/direction.png" />
					</div>
					<div class="CountNum">
						目前订票人数为：<h5>15</h5>
					</div>
					<div class="price">
						售价：<h5>${travelInfo.price}</h5>
					</div>
					<div class="destination">
						<h1>${travelInfo.endProvince}</h1>
						<h4>终点：${travelInfo.end}</h4>
						<h5>发布人：${travelInfo.ownerName}</h5>
						<h5>tel：${travelInfo.ownerTel}</h5>
					</div>
				</div>
			</div>
		</div>

		<div class="sub_title">
			<h4>乘车人信息</h4>
		</div>
	<div class="container">
		<div class="form_bg jumbotron">
			<form:form id="bookingForm" method="post" modelAttribute="bookInfo" onsubmit="submitJson('bookingForm','bookInfo/addBookInfo', '订票成功！')">
				<div class="form-group">
					<label for="name">乘车人姓名</label>
					<input type="text" class="form-control" id="name" name="name" placeholder="请输入真实姓名">
				</div>
<!-- 				<div class="form-group">
					<label for="exampleInputIdCard">乘车人身份证号码</label>
					<input type="text" class="form-control" id="exampleInputIdCard" name="exampleInputIdCard" placeholder="请输入18位身份证号码">
				</div> -->
				<div class="form-group">
					<label for="tel">乘车人联系方式</label>
					<input type="text" class="form-control" id="tel" name="tel" placeholder="请输入11位有效电话号码">
				</div>
				<input type="hidden" name="userId" value="${sessionScope.user.id }">
				<input type="hidden" name="travelInfoId" value="${travelInfo.id }">
				
				<button type="submit" class="btn btn-default" >提交订单</button>
			</form:form>
		</div>
	</div>

	<script>
		$("#bookingForm").validate({
			errorPlacement: function(error, element) {
				// Append error within linked label
				$(element)
					.closest("form")
					.find("label[for='" + element.attr("id") + "']")
					.append(error);
			},
			errorElement: "span",
			rules: {
				name: {
					required: true
				},
				/* exampleInputIdCard: {
					required: true,
					maxlength: 18,
					minlength: 18
				}, */
				tel: {
					required: true,
					maxlength: 11,
					minlength: 11
				}
			},

		})
	</script>
	</body>

</html>