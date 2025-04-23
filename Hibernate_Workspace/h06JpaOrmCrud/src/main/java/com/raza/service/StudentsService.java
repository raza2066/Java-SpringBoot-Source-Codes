package com.raza.service;

import com.raza.bean.StudentsBean;

public interface StudentsService {

	int addnewStudent(StudentsBean studentsBean) throws Exception;

	StudentsBean findStudentById(int id) throws Exception;
	
	StudentsBean updateStudentbyId(StudentsBean studentsBean) throws Exception;
	
	StudentsBean deleteStudentById(int id) throws Exception;
	
}
