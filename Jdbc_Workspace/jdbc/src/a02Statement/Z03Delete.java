package a02Statement;
import java.sql.*;

public class Z03Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = connection.createStatement();
		
		String query = "delete from Students where Student_id = 5";
		int result = statement.executeUpdate(query);
		
		System.out.println((result>0)?"true":"false");
		
		statement.close();
		connection.close();
	}
}
