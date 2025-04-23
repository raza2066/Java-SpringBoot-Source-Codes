package com.raza.s05Autowiring;

public class Laptop implements Computer {
	
	public Laptop() {
		super();
	}

	public void compile() {
		System.out.println("*******Compiling in Laptop********");
	}
}
