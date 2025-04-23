package com.raza.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeCotroller {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,  @RequestParam("num2") int j, HttpSession session){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("additionResult");
		
		int k = i+j;
		mv.addObject("num", k);
		
		session.setAttribute("number", k);
		
		return mv;
	}
	
	@RequestMapping("square")
	public String add(Model m, HttpSession session){
		
		int i = (int) session.getAttribute("number");
		
		int s = i*i;
		m.addAttribute("square", s);
		
		return "squareResult";
	}
	
	
}
