package javaStreamsProblems;

import java.util.Arrays;
import java.util.List;

//Calculate the average age of a list of Person objects using Java streams

class Person {

	public String name;
	public Integer age;
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

public class S02AverageOfList {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		System.out.println(
							persons.stream()
								   .mapToInt(Person::getAge)
								   .average()
								   .orElse(0)
						);
	}
}
