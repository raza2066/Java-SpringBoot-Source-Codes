package a04FullStructure.ui;

import java.sql.Date;
import java.sql.SQLException;

import a04FullStructure.bean.StudentsBean;
import a04FullStructure.service.Service;
import a04FullStructure.service.ServiceImpl;

public class Tester {
	public static void main(String[] args) {
		readStudent();
//		insertStudent();
//		UpdateStudent();
//		Deletestudent();
//		System.out.println(getStudentsBean(1).toString());
		
	}

	public static void insertStudent() {
		StudentsBean studentsBean = new StudentsBean();
		studentsBean.setId(6);
		studentsBean.setFirstName("Nadeem");
		studentsBean.setLastName("Raza");
		studentsBean.setDob(Date.valueOf("2001-05-07"));
		studentsBean.setEmail("captainrogers646@gmail.com");
		studentsBean.setEnrollmentDate(Date.valueOf("2024-06-26"));
		
		Service service = new ServiceImpl();
		
		try {
			service.insertStudents(studentsBean);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void readStudent() {
		Service service = new ServiceImpl();
		try {
			service.readStudent();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static StudentsBean getStudentsBean(int id) {
		Service service = new ServiceImpl();
		
		try {
			return(service.getStudentsbean(id));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void UpdateStudent() {
		int id = 1;
		StudentsBean studentsBean = getStudentsBean(id);
		studentsBean.setFirstName("John");
		studentsBean.setLastName("Wick");
		
		Service service = new ServiceImpl();
		try {
			service.updateStudent(studentsBean);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void Deletestudent() {
		Service service = new ServiceImpl();
		
		try {
			service.deleteStudent(6);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
