package a05Interface;

@FunctionalInterface
interface Func {
	void show();
}


//We can use lambda expression in place of anonymous inner class in functional interface

public class Z06FunctionalInterface {
	public static void main(String[] args) {
		Func func = ()-> 
			{
				System.out.println("Executing Show.....");
			};
		func.show();
	}
}


