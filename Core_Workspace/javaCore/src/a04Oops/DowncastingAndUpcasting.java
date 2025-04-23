package a04Oops;

class D{
	public void show1() {
		System.out.println("Execuring Class D");
	}
}
class E extends D{
	public void show2() {
		System.out.println("Execuring Class E");
	}
}

public class DowncastingAndUpcasting {
	public static void main(String[] args) {
		D obj = new E();           //upcasting to parent
		obj.show1();
		
		E obj1 = (E)obj;           //downcasting to  child
		obj1.show2();
		
	}
}
