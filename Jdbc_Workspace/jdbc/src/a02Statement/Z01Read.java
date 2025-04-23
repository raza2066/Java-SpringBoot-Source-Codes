package a02Statement;

//Import Package
import java.sql.*;

public class Z01Read {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish a Connection
		String url = "jdbc:mysql://localhost:3306/JavaFullStack";
		String uname = "root";
		String pass = "Raza7839";
		Connection connection = DriverManager.getConnection(url, uname, pass);
		
		//Create a Statement
		Statement statement = connection.createStatement();
		
		//Execute query
		String query = "Select * from Students";
		ResultSet resultSet = statement.executeQuery(query);
		
		//Manipulate Result
		while(resultSet.next()) {
			int id = resultSet.getInt("student_id");
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			Date dob = resultSet.getDate("date_of_birth");
			String email = resultSet.getString("email");
			Date enrollmentDate = resultSet.getDate("enrollment_date");
			
//			System.out.println(firstName);
			System.out.println("ID: "+id+"\n"+"Name: "+firstName+" "+lastName+"\n"+"Date of Birth: "+dob+"\n"+"Email: "+email+"\n"+"Enrollment Date: "+enrollmentDate);
			System.out.println("============================");
		}
		
		
		//Close Connection.
		statement.close();
		connection.close();
	}

}
