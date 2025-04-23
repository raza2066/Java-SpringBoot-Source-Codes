<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Read Data Using Jsp</title>
</head>
<body>
	
	<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/JavaFullStack";
	String uname = "root";
	String pass = "Raza7839";
	
	Connection connection = DriverManager.getConnection(url,uname,pass);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from students");
	
	while(resultSet.next()) {
		int id = resultSet.getInt("student_id");
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("last_name");
		Date dob = resultSet.getDate("date_of_birth");
		String email = resultSet.getString("email");
		Date enrollmentDate = resultSet.getDate("enrollment_date");
		
		out.println("ID: "+id+"<br>"+"Name: "+firstName+" "+lastName+"<br>"+"Date of Birth: "+dob+"<br>"+"Email: "+email+"<br>"+"Enrollment Date: "+enrollmentDate+"<br>");
		out.println("============================<br>");
	}
	System.out.print("Data Retrieved Successfully");
	%>
	
</body>
</html>