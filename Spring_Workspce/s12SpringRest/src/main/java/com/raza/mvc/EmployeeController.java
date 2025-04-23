package com.raza.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raza.dao.EmployeeRepo;
import com.raza.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping(path = "employee", produces = {"application/json"})
	public List<Employee> getEmployee() {
		List<Employee> employees = repo.findAll();
		return employees;
	}
	
	@GetMapping("employee/{eid}")
	public Employee getEmployeeByID(@PathVariable("eid") int eid) {
		Employee employee = repo.findById(eid).orElse(new Employee(0,"",""));
		return employee;
	}
	
	@PostMapping(path = "employee", consumes = {"application/json"})
	public Employee addEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}
	
}
