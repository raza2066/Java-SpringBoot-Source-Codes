package com.jstl;

public class Student {
	int rollNo;
	String Name;
	
	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", Name=" + Name + "]";
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}
	
}
