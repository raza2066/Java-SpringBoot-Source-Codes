package com.raza.bean;

import java.util.Date;

public class StudentsBean {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String email;
	private Date enrollmentDate;
	
	//Default Constructor
	public StudentsBean() {
		super();
	}
	
	//parameterized constructor
	public StudentsBean(int id, String firstName, String lastName, Date dob, String email, Date enrollmentDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.enrollmentDate = enrollmentDate;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	//ToString
	@Override
	public String toString() {
		return "StudentsBean \n[ id: " + id 
							+ "\n Name: " + firstName +" "+ lastName 
							+ "\n dob: " + dob
							+ "\n email: " + email 
							+ "\n enrollmentDate: " + enrollmentDate + "   ]";
	}
}

