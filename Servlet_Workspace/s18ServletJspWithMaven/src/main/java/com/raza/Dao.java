package com.raza;
import java.sql.*;

public class Dao {

	public Students getStudent(int student_id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish a Connection
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		//Create a Statement
		Statement statement = connection.createStatement();
		
		//Execute query
		String query = "Select * from Students where student_id = "+ student_id;
		ResultSet resultSet = statement.executeQuery(query);
		Students student = new Students();
		if(resultSet.next()) {
			student.setId(resultSet.getInt("student_id"));
			student.setFirstName(resultSet.getString("first_name"));
			student.setLastName(resultSet.getString("last_name"));
			student.setDob(resultSet.getDate("date_of_birth"));
			student.setEmail(resultSet.getString("email"));
			student.setEnrollmentDate(resultSet.getDate("enrollment_date"));
		}
		
		return student;
	}

}
