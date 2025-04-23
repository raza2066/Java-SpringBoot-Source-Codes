package com.raza.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "students")
public class StudentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "enrollment_date")
	@Temporal(TemporalType.DATE)
	private Date enrollmentDate;
	
	//Default Constructor
	public StudentsEntity() {
		super();
	}
	
	//parameterized constructor
	public StudentsEntity(int id, String firstName, String lastName, Date dob, String email, Date enrollmentDate) {
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
		return "StudentsBean [ id: " + id 
							+ "\n Name: " + firstName + lastName 
							+ "\n dob: " + dob
							+ "\n email: " + email 
							+ "\n enrollmentDate: " + enrollmentDate + " ]";
	}
}

