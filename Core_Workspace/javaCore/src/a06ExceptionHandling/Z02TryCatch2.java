package a06ExceptionHandling;

public class Z02TryCatch2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int i = 2;
		int j = 10;
		int nums[] = new int[5];
		String str = null;
		
		try{
			j = 10/i;
			System.out.println(str.length());
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Index out of Bound");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(j);
		System.out.println(nums[0]);
	}
}
