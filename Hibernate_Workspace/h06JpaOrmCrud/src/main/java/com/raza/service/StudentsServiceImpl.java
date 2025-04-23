package com.raza.service;

import com.raza.bean.StudentsBean;
import com.raza.dao.StudentsDao;
import com.raza.utility.Factory;

public class StudentsServiceImpl implements StudentsService {

	@Override
	public int addnewStudent(StudentsBean studentsBean) throws Exception {
		int id = 0;
		
		try {
			StudentsDao dao = Factory.createStudentsDao();
			id = dao.addnewStudent(studentsBean);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return id;
	}

	@Override
	public StudentsBean findStudentById(int id) throws Exception {
		StudentsBean student = null;
		try {
			StudentsDao dao = Factory.createStudentsDao();
			student = dao.findStudentById(id);
			if(student==null) {
				System.out.println("Invalid Id");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return student;
	}
	
	@Override
	public StudentsBean updateStudentbyId(StudentsBean studentsBean) throws Exception {
		StudentsBean student = null;
		try {
			StudentsDao dao = Factory.createStudentsDao();
			student = dao.updateStudentbyId(studentsBean);
			if(student==null) {
				System.out.println("Invalid Id");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return student;
	}

	@Override
	public StudentsBean deleteStudentById(int id) throws Exception {
		StudentsBean student = null;
		try {
			StudentsDao dao = Factory.createStudentsDao();
			student = dao.deleteStudentById(id);
			if(student==null) {
				System.out.println("Invalid Id");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return student;
	}

}
