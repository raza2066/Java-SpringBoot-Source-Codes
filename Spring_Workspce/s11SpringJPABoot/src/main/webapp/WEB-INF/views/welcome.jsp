<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Employee</title>
</head>
<body>
	
	<form action="inputEmployee">
		<input type = "submit" value = "Add Employees">
	</form>
	
	<hr>
	<form action="getEmployee">
		<input type = "submit" value = "Show All Employees">
	</form>
	
	<hr>
	<form action="getEmployeewithID">
		<input type = "text" name = "eid">
		<input type = "submit" value = "Show Employee With ID">
	</form>
	
	<hr>
	<form action="getEmployeewithName">
		<input type = "text" name = "name">
		<input type = "submit" value = "Show Employee With Name">
	</form>
	
</body>
</html>