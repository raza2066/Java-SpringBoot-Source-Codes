package com.raza.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien){
		//no need for requestparam individually
		//no need for manually adding the attribute to the model for fetching the data.
		
//		m.addAttribute("alien", a);
		
		
		return "result";
	}
	
}
