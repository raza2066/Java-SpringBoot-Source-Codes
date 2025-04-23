package a08Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>{
	String name;
	int age;
	
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
		
	@Override
	public int compareTo(Students that) {
		if(this.age>that.age) {
			return 1;
		}
		return -1;
	}
	

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}
}

public class Z07CollectionSorting3 {
	public static void main(String[] args) {
		
		List<Students> list = new ArrayList<Students>();
		list.add(new Students("Raza", 23));
		list.add(new Students("Huzaifa", 32));
		list.add(new Students("Ayan", 65));
		list.add(new Students("Zain", 14));
		
		
		for(Students st: list) {
			System.out.println(st);
		}
		System.out.println("================================");
		
		Collections.sort(list);
		
		for(Students st: list) {
			System.out.println(st);
		}
	}

}
