package manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Employee> employee = new ArrayList<>();;
	
	
	
	public int getLid() {
		return lid;
	}



	public void setLid(int lid) {
		this.lid = lid;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public List<Employee> getEmployee() {
		return employee;
	}



	public void setEmlployee(List<Employee> employee) {
		this.employee = employee;
	}



	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
}
