package a04FullStructure.service;

import java.sql.SQLException;

import a04FullStructure.bean.StudentsBean;
import a04FullStructure.dao.Dao;
import a04FullStructure.dao.DaoImpl;

public class ServiceImpl implements Service {
	
	Dao dao = new DaoImpl();
	@Override
	public void insertStudents(StudentsBean bean) throws ClassNotFoundException, SQLException {
		dao.insertStudents(bean);
	}

	@Override
	public void readStudent() throws ClassNotFoundException, SQLException {
		dao.readStudent();
	}
	public StudentsBean getStudentsbean(int id) throws ClassNotFoundException, SQLException{
		return dao.getStudentsbean(id);
	}


	@Override
	public void updateStudent(StudentsBean bean) throws ClassNotFoundException, SQLException {
		dao.updateStudent(bean);
	}

	@Override
	public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
		dao.deleteStudent(id);
	}

}
