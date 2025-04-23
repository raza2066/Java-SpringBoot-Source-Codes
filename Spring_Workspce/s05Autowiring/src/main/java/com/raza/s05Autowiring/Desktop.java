package com.raza.s05Autowiring;

public class Desktop implements Computer {
	
	public Desktop(){
		super();
	}

	public void compile() {
		System.out.println("*******Compiling in Desktop********");
	}
}