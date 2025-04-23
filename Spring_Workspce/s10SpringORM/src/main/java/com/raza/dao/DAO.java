package com.raza.dao;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raza.model.Employee;

import jakarta.transaction.Transactional;

@Repository
public class DAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Employee> getEmployees(){
		Session session = sessionFactory.getCurrentSession();
		
		List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
		return employees;
	}
	
	@Transactional
	public Employee getEmployeeswithID(int eid){
		Session session = sessionFactory.getCurrentSession();
		
		Employee employee = session.get(Employee.class,eid);
		return employee;
	}
	
	@Transactional
	public void addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}
}
