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
	<%
		String name =(String)request.getAttribute("name");
		out.print("Name fetched by java code(Scriptlet tag): " + name+"<br>");
	%>
		Name fetched by Expression Language: ${name}<br>
		
		Name fetched by JSTL: <c:out value="${name}" />
</body>
</html>