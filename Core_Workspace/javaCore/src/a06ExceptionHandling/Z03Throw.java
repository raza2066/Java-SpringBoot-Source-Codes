package a06ExceptionHandling;

public class Z03Throw {
	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0) throw new ArithmeticException("I dont want to print zero");
		} catch (ArithmeticException e) {
			j=20;
			System.out.println(e+"\nDefault Output triggered");
		}
		System.out.println(j);
	}
}
