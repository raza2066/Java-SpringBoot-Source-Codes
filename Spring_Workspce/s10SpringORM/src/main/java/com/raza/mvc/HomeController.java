package com.raza.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raza.dao.DAO;
import com.raza.model.Employee;


@Controller
public class HomeController {
	
	@Autowired
	DAO dao;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("========Index Page Requested========");
		return "welcome";
	}
	
	@RequestMapping("inputEmployee")
	public String inputEmployee() {
		return "addEmployee";
	}
	
	
	@RequestMapping("getEmployee")
	public String getEmployee(Model m){
		m.addAttribute("result", dao.getEmployees());
		return "showEmployee";
	}
	
	@RequestMapping("getEmployeewithID")
	public String getEmployeewithID(@RequestParam("eid") int eid,Model m){
		m.addAttribute("result", dao.getEmployeeswithID(eid));
		return "showEmployee";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("newEmployee") Employee employee){
		dao.addEmployee(employee);
		System.out.println("Employee Added");
		return "showEmployee";
	}
	
}
