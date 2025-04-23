<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Videos</title>
</head>
<body>


	Welcome ${uname}<br>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/AOKrsGCDhB8?si=pbNsejb4r49TAWdO" title="YouTube video player" ></iframe>
	
	<br><br>

	<a href = "/s17LoginUsingServletFilterandHttpSession/welcome.jsp">Home</a><br>	
	<form action="logout">
		<input type = "submit" value = "logout">
	</form>
	
	
</body>
</html>