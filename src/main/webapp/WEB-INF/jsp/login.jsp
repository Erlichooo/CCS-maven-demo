<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    
    <script type="text/javascript">
		function massage() {
			var msg='<%= session.getAttribute("msg")%>'
			if(msg != "" && msg!="null")	alert(msg);
			<% session.setAttribute("msg","");%>
		}
	</script>

    <title>校园订票系统</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body onload="massage()">

    <div class="container">

      <form:form action="user/login" method="post" modelAttribute="user" class="form-signin">
        <h2 class="form-signin-heading">请登录</h2>
        <label for="inputTel" class="sr-only">Email address</label>
        <input name="username" type="tel" id="inputTel" class="form-control" placeholder="手机号码" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="密码" required>
        <div>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" value="remember-me"> 记住我
	          </label>
	        </div>
	        <a class="register" href="user/toRegister">免费注册</a>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form:form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
  </body>
</html>

