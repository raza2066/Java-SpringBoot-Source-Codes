package a01JdbcProcess;

public class Z01Steps {
	public static void main(String[] args) {
		String step = "1. Import the Package.		(java.sql.*)\n"	
				+"2a.Load the Driver.		(jar file: mysql-connector)\n"
				+"2b.Register the Driver.		forName(com.mysql.jdbc.driver)\n"
				+"3.Establish a Connection.	(Connection 'URL', 'Username', 'Passsword')\n"
				+"4.Create a Statement.		(connection.createStatement)(Statement, Prepared Statement, callable)\n"
				+"5.Execute the Querry.		(statement.executeQuery('select * from Student'))\n"
				+"6.Process Results.		(rs.next(), rs.get(int)...........\n"
				+"7.Close the connection.		(statement.close(), connection.close())\n";
		
		System.out.println(step);
	}
}
