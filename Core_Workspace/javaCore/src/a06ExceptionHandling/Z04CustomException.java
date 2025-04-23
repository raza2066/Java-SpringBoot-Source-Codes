package a06ExceptionHandling;
@SuppressWarnings("serial")
class CustomException extends Exception{
	public CustomException(String str) {
		super(str);
	}
}

public class Z04CustomException {
	public static void main(String[] args) {
		int i = 20;
		int j = 0;
		
		try {
			j = -36/i;
			if(j<0) throw new CustomException("I dont want to print negative values");
		} 
		catch (CustomException e) {
			System.out.println(e+"\nCustom Output triggered");
		}
	}
}
