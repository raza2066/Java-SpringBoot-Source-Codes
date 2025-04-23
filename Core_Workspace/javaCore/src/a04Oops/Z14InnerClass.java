package a04Oops;


class Hooman{
	int age;
	public void show() {
		System.out.println("Executing Hooman show");
	}
	static class Kid{
		public void show() {
			System.out.println("Executing Kid show");
		}
	}
	public class Kid1{
		public void show() {
			System.out.println("Executing Kid1 show");
		}
	}
}

public class Z14InnerClass {
	public static void main(String[] args) {
		Hooman hooman = new Hooman();
		hooman.show();
		
		Hooman.Kid obj = new Hooman.Kid();
		obj.show();
		
		Hooman.Kid1 obj1 = hooman.new Kid1();
		obj1.show();
	}
	
}
