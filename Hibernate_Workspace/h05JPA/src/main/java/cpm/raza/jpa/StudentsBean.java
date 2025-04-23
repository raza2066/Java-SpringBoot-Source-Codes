package cpm.raza.jpa;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Students")
public class StudentsBean {
	
	@Id
	@Column(name ="student_id")
	private int id;
	
	private NameBean name;
	
	@Column(name ="date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="enrollment_date")
	@Temporal(TemporalType.DATE)
	private Date enrollmentDate;
	
	//Default Constructor
	public StudentsBean() {
		super();
	}
	
	//parameterized constructor
	public StudentsBean(int id, NameBean name, Date dob, String email, Date enrollmentDate) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	public NameBean getName() {
		return name;
	}
	public void setName(NameBean name) {
		this.name = name;
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
		return "StudentsBean:"+
							"\n [Id=" + id + 
							"\n Name=" + name + 
							"\n DOB=" + dob + 
							"\n Email=" + email + 
							"\n EnrollmentDate="+ enrollmentDate + "]";
	}

}

