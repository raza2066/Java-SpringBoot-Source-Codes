<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Function Tags</title>
</head>
<body>
	<c:set var = "str" value = "Nadeem Raza is An Advanced Application Engineering Analyst"></c:set>
	${str}<br>
	Length of the string: ${fn:length(str)}<br><br>
	
	Spliting words: <br>
	<c:forEach items = "${fn:split(str, ' ')}" var = "word">
		${word}<br>
	</c:forEach>
	<br>

	<c:if test="${fn:contains(str, 'Raza')}">
		String Found<br>
	</c:if>
</body>
</html>