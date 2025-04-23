package a04Oops;


class AAA{
	public void show() {
		System.out.println("Class A Running");
	}
}

class BBB extends AAA{
	public void show() {
		System.out.println("Class B Running");
	}
}

class CCC extends AAA{
	public void show() {
		System.out.println("Class C Running");
	}
}

public class Z10DynamimethodDispatch {
	public static void main(String[] args) {
		AAA obj = new AAA();                 
		obj.show();
		
		obj = new BBB();
		obj.show();
		
		obj = new CCC();        //same object is been assigned with 3 different classes.
		obj.show();            //the object reference of parent class can become a reference of child class
	}
}


