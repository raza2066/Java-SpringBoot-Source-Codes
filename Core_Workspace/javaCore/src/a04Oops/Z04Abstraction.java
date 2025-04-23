package a04Oops;

public class Z04Abstraction {
	public static void main(String[] args) {
        Human h = new Human();

        h.setAge(23);
        h.setName("Nadeem Raza");

        System.out.println("Name: "+ h.getName() +"\nAge: "+h.getAge());
    }
}
