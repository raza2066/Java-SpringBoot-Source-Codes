package com.raza;

public class Alien {
	private int age;
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public int getAge() {
		System.out.println("Setter Called");
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void code() {
		System.out.println("********Coding*******");
		laptop.compile();
	}
}
