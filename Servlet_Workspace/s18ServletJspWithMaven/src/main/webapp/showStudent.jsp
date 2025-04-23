<%@page import="com.raza.Students"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "cyan">

	<%
		Students student = (Students)request.getAttribute("student");
		out.print(student);
	%>

</body>
</html>