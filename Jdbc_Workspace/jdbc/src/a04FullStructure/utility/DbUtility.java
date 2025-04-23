package a04FullStructure.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
	
	private static String url = "jdbc:mysql://localhost:3306/JavaFullStack";
	private static String uname = "root";
	private static String pass = "Raza7839";
	private static Connection connection;
	
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Registered Driver Successfully");
		
		connection = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established Successfully");
		return connection;
	}
	
	public static void destroyConnection() throws SQLException {
		connection.close();
		System.out.println("Connection Closed successfully");
	}
}
