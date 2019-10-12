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
		<link href="css/publish.css" rel="stylesheet">

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
		<div class="container content">
			<div class="title">
				<h3>班车信息发布</h3>
			</div>
			<div class="form_bg">
				<form:form id="publishForm" modelAttribute="travelInfo" onsubmit="submitJson('publishForm','travelInfo/addTravelInfo', '发布成功！')">
					<div class=" jumbotron">
						<div class="form-group">
							<label for="startProvince">出发城市</label>
							<input type="text" class="form-control" id="startProvince" name="startProvince" placeholder="请输入出发城市">
						</div>
						<div class="form-group">
							<label for="start">出发地</label>
							<input type="text" class="form-control" id="start" name="start" placeholder="请输入班车出发地">
						</div>
						<div class="form-group">
							<label for="exampleInputDepDate">出发时间</label>
							<input type="date" class="form-control" id="exampleInputDepDate" name="exampleInputDepDate" placeholder="请输入出发时间">
						</div>
					</div>
					<div class=" jumbotron">
						<div class="form-group">
							<label for="endProvince">到达城市</label>
							<input type="text" class="form-control" id="endProvince" name="endProvince" placeholder="请输入到达城市">
						</div>
						<div class="form-group">
							<label for="end">目的地</label>
							<input type="text" class="form-control" id="end" name="end" placeholder="请输入班车目的地">
						</div>
						<div class="form-group">
							<label for="exampleInputDesDate">到达时间</label>
							<input type="date" class="form-control" id="exampleInputDesDate" name="exampleInputDesDate" placeholder="请输入到达时间">
						</div>
					</div>
					<div class="form-group">
						<label for="price">票价</label>
						<input type="number" class="form-control" id="price" name="price" placeholder="请输入票价">
					</div>
					<input type="hidden" name="ownerId" value="${sessionScope.owner.id }">
				
					<button type="submit" class="btn btn-default">发布信息</button>
				</form:form>
			</div>
		</div>
		<script>
			var login = $(".login-state").text().trim()
			if(login == "未登录") {
				$(".user").addClass("hidden")
			} else $(".user").removeClass("hidden")
			
			$("#publishForm").validate({
				errorPlacement: function(error, element) {
					// Append error within linked label
					$(element)
						.closest("form")
						.find("label[for='" + element.attr("id") + "']")
						.append(error);
				},
				errorElement: "span",
				rules: {
					startProvince: {
						required: true
					},
					start: {
						required: true,
					},
					exampleInputDepDate: {
						required: true,
						date:true
					},
					endProvince:{
						required: true
					},
					end:{
						required: true
					},
					exampleInputDesDate:{
						required: true,
						date:true
					},
					price:{
						required: true,
						number:true
					}
				},

			})
		</script>
</body>
</html>