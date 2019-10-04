<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="/WEB-INF/jsp/login.jsp"></jsp:forward>
	<%-- <%response.sendRedirect("WEB-INF/jsp/login.jsp"); %> --%><!-- 重定向不能访问web-inf下资源 -->
</body>
</html>