<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>

	${students}<br><br>
	
	<c:forEach items = "${students}" var = "s">
		${s}<br>
		${s.rollNo}<br>
		${s.name}<br><br>
	</c:forEach>
	
</body>
</html>