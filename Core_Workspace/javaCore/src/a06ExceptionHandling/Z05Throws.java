package a06ExceptionHandling;

class Nigga{
	public static void show() throws ClassNotFoundException{
		Class.forName("broooooo");
	}
}
public class Z05Throws {
	public static void main(String[] args) {
		try {
			Nigga.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
