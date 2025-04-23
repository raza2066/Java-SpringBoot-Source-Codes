<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>


	Welcome to my page.<br><br>
	<a href = "/s17LoginUsingServletFilterandHttpSession/videos.jsp">My Videos</a><br>
	<a href = "/s17LoginUsingServletFilterandHttpSession/photos.jsp">My Photos</a><br>
	<a href = "/s17LoginUsingServletFilterandHttpSession/devices.jsp">My devices</a><br>
	<a href = "/s17LoginUsingServletFilterandHttpSession/aboutMe.jsp">About Me</a><br><br>
	
	${uname}
	<c:choose>
		
		<c:when test="${sessionScope.uname == null}">
			<form action="login.jsp">
				<input type = "submit" value = "Login">
			</form>
		</c:when>
		
		<c:otherwise>
			<form action="logout">
				<input type = "submit" value = "logout">
			</form>
		</c:otherwise>
	
	</c:choose>
	
</body>
</html>