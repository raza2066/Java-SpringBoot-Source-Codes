package a04FullStructure.service;

import java.sql.SQLException;

import a04FullStructure.bean.StudentsBean;

public interface Service {
	public void insertStudents(StudentsBean bean) throws ClassNotFoundException, SQLException;
	public void readStudent() throws ClassNotFoundException, SQLException;
	public StudentsBean getStudentsbean(int id) throws ClassNotFoundException, SQLException;
	public void updateStudent(StudentsBean bean) throws ClassNotFoundException, SQLException;
	public void deleteStudent(int id) throws ClassNotFoundException, SQLException;
}
