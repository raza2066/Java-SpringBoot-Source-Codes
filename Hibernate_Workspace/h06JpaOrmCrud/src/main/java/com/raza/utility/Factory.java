package com.raza.utility;

import com.raza.dao.StudentsDao;
import com.raza.dao.StudentsDaoImpl;
import com.raza.service.StudentsService;
import com.raza.service.StudentsServiceImpl;

public class Factory {
	
	public static StudentsService createStudentsService() {
		return new StudentsServiceImpl();
	}
	
	public static StudentsDao createStudentsDao() {
		return new StudentsDaoImpl();
	}
	
}
