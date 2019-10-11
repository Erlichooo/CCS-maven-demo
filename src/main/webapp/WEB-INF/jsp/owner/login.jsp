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

  </head>

  <body onload="massage()">
  	<center><h1>校园包车系统</h1></center>

    <div class="container">

      <form:form action="owner/login" method="post" modelAttribute="owner" class="form-signin">
        <h2 class="form-signin-heading">
        商家版
        	<a class="linker" href="user/toLogin">用户入口</a>
        </h2>
        <label for="inputTel" class="sr-only">Email address</label>
        <input name="username" type="tel" id="inputTel" class="form-control" placeholder="手机号码" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="密码" required>
        <div class="form-signin-footer">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
		  <a class="linker" href="owner/toRegister">免费注册</a>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form:form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
  </body>
</html>

