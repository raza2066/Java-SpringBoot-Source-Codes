package a05Interface;


interface A{                            //Not a class
	
	int num1 = 44;
	String address1 = "Banglore";             //All variables in interface are FINAL and STATIC          
	
	void show();
	void config();                       //by default every method is PUBLIC and ABSTRACT
}
interface AA{
	void run();
}

interface AAA extends AA{
	
}

class B implements A,AAA{

	public void show() {
		System.out.println("Executing Show....");
	}

	public void config() {
		System.out.println("Executing Config....");
	}

	public void run() {
		System.out.println("Executing Run....");
	}
	
}
public class Z01Interface {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.config();
		obj.run();
		System.out.println(A.num1);
		System.out.println(A.address1);
	}
	
}
