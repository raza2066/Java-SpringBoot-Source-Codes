package com.raza.s05Autowiring;

public class Alien {
	private int age;
	private  Computer computer;
	
	
	
	public Alien() {
		super();
	}


	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public int getAge() {
		System.out.println("Age Getter Called");
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age Setter Called");
		this.age = age;
	}

	public void code() {
		System.out.println("********Coding*******");
		computer.compile();
	}
}
