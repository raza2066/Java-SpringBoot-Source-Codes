package a02Statement;
import java.sql.*;

public class Z02Update {
	public static void main(String[] arg) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = connection.createStatement();
		
		String query = "UPDATE Students SET first_name = 'Nadeem', last_name = 'Raza' where student_id = 1";
		int result = statement.executeUpdate(query);
		
		System.out.println((result>0)?"true":"false");
		
		statement.close();
		connection.close();
	}
}
