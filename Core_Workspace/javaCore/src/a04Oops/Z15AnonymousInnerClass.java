package a04Oops;

class G{
	public void show() {
		System.out.println("Executing Class G");
	}
}

public class Z15AnonymousInnerClass {
	public static void main(String[] args) {
		G obj = new G()
		{
			public void show() {
				System.out.println("Executing New show");
			}
		};
		obj.show();
	}
}
