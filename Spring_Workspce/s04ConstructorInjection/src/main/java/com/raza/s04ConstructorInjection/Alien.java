package com.raza.s04ConstructorInjection;

public class Alien {
	private int age;
	private Laptop laptop;
	
//	public Alien() {
//		System.out.println("Alien Object Created");
//	}

	public Alien(int age, Laptop laptop) {
		System.out.println("Alien Constructor Called");
		this.age = age;
		this.laptop = laptop;
	}

	public Laptop getLaptop() {
		System.out.println("Laptop Getter Called");
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		System.out.println("Laptop Setter Called");
		this.laptop = laptop;
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
		laptop.compile();
	}
}
