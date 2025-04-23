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
	<form action="getEmployee">
		<input type = "submit" value = "Show All Employees">
	</form>
	<form action="getEmployeewithID">
		<input type = "text" name = "eid">
		<input type = "submit" value = "Show Employee With ID">
	</form>
	
</body>
</html>