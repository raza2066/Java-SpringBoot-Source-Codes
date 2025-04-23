package com.raza.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raza.dao.EmployeeRepo;
import com.raza.model.Employee;


@Controller
public class HomeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("========Index Page Requested========");
		return "welcome";
	}
	
	@RequestMapping("getEmployee")
	public String getEmployee(Model m){
		m.addAttribute("result", repo.findAll());
		
		return "showEmployee";
	}
	
	@RequestMapping("getEmployeewithID")
	public String getEmployeewithID(@RequestParam("eid") int eid,Model m){
		m.addAttribute("result", repo.getOne(eid));
		return "showEmployee";
	}
	
	@RequestMapping("getEmployeewithName")
	public String getEmployeewithName(@RequestParam("name") String name,Model m){
//		m.addAttribute("result", repo.findByName(name));
		m.addAttribute("result", repo.find(name));
		return "showEmployee";
	}
	
	@RequestMapping("inputEmployee")
	public String inputEmployee() {
		return "addEmployee";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("newEmployee") Employee employee){
		repo.save(employee);

		return "showEmployee";
	}
	
}
