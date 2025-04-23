package com.raza.ui;

import java.sql.Date;

import com.raza.bean.StudentsBean;
import com.raza.service.StudentsService;
import com.raza.utility.Factory;
import com.raza.utility.JPAUtility;

public class App 
{
    public static void main( String[] args )
    {
    	try {
//    		addStudent();
    		findStudent();
//    		UpdateStudent();
//    		DeleteStudent();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			JPAUtility.closeEntityManagerFactory();
		}
        
        
    }

    public static void addStudent() {
    	StudentsBean studentsBean = new StudentsBean();
    	
		studentsBean.setFirstName("Nadeem");
		studentsBean.setLastName("Raza");
		studentsBean.setDob(Date.valueOf("2001-05-07"));
		studentsBean.setEmail("captainrogers646@gmail.com");
		studentsBean.setEnrollmentDate(Date.valueOf("2024-06-26"));
		
		StudentsService service = Factory.createStudentsService();
		
	
		try {
			int id = service.addnewStudent(studentsBean);
			if(id!=0)System.out.println("Student Added Successfully with id: "+id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
    }

    public static void findStudent() {
    	int id = 1;
    	StudentsService service = Factory.createStudentsService();
    	
    	try {
			StudentsBean student = service.findStudentById(id);
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
    }
    public static void UpdateStudent() {
		int id = 8;
		
		try {
			StudentsService service = Factory.createStudentsService();
			StudentsBean student = new StudentsBean();
			student.setId(id);
			student.setFirstName("Captain");
			StudentsBean bean = service.updateStudentbyId(student);
			System.out.println("Employee updated with id"+bean.getId());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

    public static void DeleteStudent() {
		int id = 8;
		StudentsService service = Factory.createStudentsService();
		
		try {
			StudentsBean student = service.deleteStudentById(id);
			System.out.println("Employee deleted with id"+student.getId());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
