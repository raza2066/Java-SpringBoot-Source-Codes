<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ include file = "header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "Cyan">
	<% 
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i+j;
	out.println("Output: "+k);
	%>
	
	<%--  
	
	<%@ directive tag -- used to import modules%>
	<%! declaration tag -- used to globally declare data members and methods%>
	<%  Scriptlet tag ---any thng written insite is same as the service method of servlet. it is treated as java code%>
	<%= expression tag-- anything written inside goes to out.print() %>
	
	--%>
	
	<%--
		directive tags contain 3 types
		@page
		@include
		@taglib
	 --%>
	
</body>
</html>