package com.raza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	int age;
	
	@Autowired
	Laptop laptop;
	
	public void code() {
		System.out.println("Coding.......");
		laptop.compile();
	}
}
