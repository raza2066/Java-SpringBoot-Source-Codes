package a03PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Z01Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		String query = "Insert into Students values(?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1,6);
		statement.setString(2, "Nadeem");
		statement.setString(3,"Raza");
		statement.setDate(4, java.sql.Date.valueOf("2001-05-07"));
		statement.setString(5,"Captainrogers646@gmail.com");
		statement.setDate(6, java.sql.Date.valueOf("2024-06-26"));
		
		
		int result = statement.executeUpdate();
		
		System.out.println((result>0)?"true":"false");
		
		statement.close();
		connection.close();
	}

}
