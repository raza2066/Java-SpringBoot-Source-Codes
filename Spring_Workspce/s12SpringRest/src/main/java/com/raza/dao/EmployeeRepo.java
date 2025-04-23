package com.raza.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.raza.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

//	List<Employee> findByName(String name);

	@Query("from Employee where name = :employeeName")
	List<Employee> find(@Param("employeeName") String name);
	
}
