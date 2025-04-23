package a06ExceptionHandling;

public class Z01TryCatch {
/*
 * 
 * Compile time error
 * Logical Error
 * Runtime Error------we need to handle these exceptions so that the execution does not stop.
 * 
 */
	
	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		try{
			j = 10/i;
		}
		catch(Exception e){
			System.out.println(e+"\n***************************************");
		}
		System.out.println(j);
		
		
		int nums[] = new int[5];
		
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println(e+"\n***************************************");
		}
		System.out.println(nums[0]);
	}
}