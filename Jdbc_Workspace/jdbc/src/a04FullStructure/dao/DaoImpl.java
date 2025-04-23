package a04FullStructure.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import a04FullStructure.bean.StudentsBean;
import a04FullStructure.utility.DbUtility;

public class DaoImpl implements Dao{
	
	private static Connection connection = null;
	private static PreparedStatement statement = null;

	@Override
	public void insertStudents(StudentsBean bean) throws ClassNotFoundException, SQLException {
		int id = bean.getId();
		String firstName = bean.getFirstName();
		String lastName = bean.getLastName();
		Date dob = (Date) bean.getDob();
		String email = bean.getEmail();
		Date enrollmentDate = (Date) bean.getEnrollmentDate();
		
		connection = DbUtility.getDBConnection();
		statement = connection.prepareStatement("insert into students values(?,?,?,?,?,?)");
		statement.setInt(1,id);
		statement.setString(2, firstName);
		statement.setString(3,lastName);
		statement.setDate(4, dob);
		statement.setString(5,email);
		statement.setDate(6, enrollmentDate);
		
		int result  = statement.executeUpdate();
		System.out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Added Succesfully");
	}

	@Override
	public void readStudent() throws ClassNotFoundException, SQLException {
		connection = DbUtility.getDBConnection();
		statement = connection.prepareStatement("select * from students ");
		
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			int id = resultSet.getInt("student_id");
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			Date dob = resultSet.getDate("date_of_birth");
			String email = resultSet.getString("email");
			Date enrollmentDate = resultSet.getDate("enrollment_date");
			
			System.out.println("ID: "+id+"\n"+"Name: "+firstName+" "+lastName+"\n"+"Date of Birth: "+dob+"\n"+"Email: "+email+"\n"+"Enrollment Date: "+enrollmentDate);
			System.out.println("============================");
		}
	}
	
	@Override
	public StudentsBean getStudentsbean(int id) throws ClassNotFoundException, SQLException {
		connection = DbUtility.getDBConnection();
		PreparedStatement statement = connection.prepareStatement("Select * from Students where student_id = ?");
		statement.setInt(1, id);
		
		ResultSet result = statement.executeQuery();
		result.next();
		
		StudentsBean bean = new StudentsBean(); 
		bean.setId(result.getInt("student_id"));
		bean.setFirstName(result.getString("first_name"));
		bean.setLastName(result.getString("last_name"));
		bean.setDob(result.getDate("date_of_birth"));
		bean.setEmail(result.getString("email"));
		bean.setEnrollmentDate(result.getDate("enrollment_date"));
		
		System.out.println((bean == null)? "Something Went Wrong!!!" : "Student Bean Retrieved Succesfully");
		return bean;
	}

	@Override
	public void updateStudent(StudentsBean bean) throws ClassNotFoundException, SQLException {	
		connection = DbUtility.getDBConnection();
		statement = connection.prepareStatement("Update students set first_name = ?, last_name = ?, date_of_birth = ?, email = ?, enrollment_date = ? where student_id = ?");
		statement.setString(1, bean.getFirstName());
		statement.setString(2, bean.getLastName());
		statement.setDate(3, (Date) bean.getDob());
		statement.setString(4,bean.getEmail());
		statement.setDate(5, (Date) bean.getEnrollmentDate());
		statement.setInt(6, bean.getId());
		
		int result =  statement.executeUpdate();
		
		System.out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Updated Succesfully");
		
		
	}

	@Override
	public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
		connection = DbUtility.getDBConnection();
		statement = connection.prepareStatement("delete from students where student_id = ?");
		
		statement.setInt(1, id);
		
		int result = statement.executeUpdate();
		System.out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Deleted Succesfully");
	}



}
