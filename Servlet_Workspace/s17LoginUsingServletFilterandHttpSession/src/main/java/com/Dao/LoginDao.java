package com.Dao;

import java.sql.*;

public class LoginDao {
	public static boolean check(String username, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		
		Connection connection = DriverManager.getConnection(url,uname,pass);
		PreparedStatement statement = connection.prepareStatement("select * from users where username = ? and password = ?");
		statement.setString(1, username);
		statement.setString(2, password);
		
		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			return true;
		}
		return false;

	}
}
