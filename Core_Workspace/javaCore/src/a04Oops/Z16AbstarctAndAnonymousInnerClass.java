package a04Oops;

abstract class Alien{
	public abstract void show();
	public abstract void diplay();
}

public class Z16AbstarctAndAnonymousInnerClass {
	public static void main(String[] args) {
		Alien alien = new Alien() 
		{
			public void show() {
				System.out.println("Executing Abstract Method Show from Anonymous Inner Class");
			}
			
			public void diplay() {
				System.out.println("Executing Abstract Method Display from Anonymous Inner Class");
			}
		};
		
		alien.show();
		alien.diplay();
	}
}
