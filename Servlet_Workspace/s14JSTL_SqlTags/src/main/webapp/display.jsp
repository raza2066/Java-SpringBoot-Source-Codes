<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Sqltags</title>
</head>
<body>
	
	<sql:setDataSource var = "javafullstack" driver = "com.mysql.cj.jdbc.Driver" 
							url = "jdbc:mysql://localhost:3306/JavaFullStack"
							user= "root" 
							password = "Raza7839" />
							
	<sql:query var = "resultSet" dataSource = "${javafullstack}">select * from students</sql:query>
	
	<c:forEach items = "${resultSet.rows}" var = "student">
		Student Id: ${student.student_id}<br>
		Student Name: ${student.first_name} ${student.last_name}<br>
		Date of Birth: ${student.date_of_birth}<br>
		Email Id: ${student.email}<br>
		Enrollment Date: ${student.enrollment_date}<br>
		===================================<br>
	</c:forEach>
	
</body>
</html>