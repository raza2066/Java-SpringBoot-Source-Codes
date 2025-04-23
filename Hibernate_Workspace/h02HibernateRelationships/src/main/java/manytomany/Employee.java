package manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	private String role;
	@ManyToMany(mappedBy = "employee")
	private List<Laptop> laptop = new ArrayList<>();;
	
	
	
	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public List<Laptop> getLaptop() {
		return laptop;
	}



	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + ", laptop=" + laptop + "]";
	}
}
