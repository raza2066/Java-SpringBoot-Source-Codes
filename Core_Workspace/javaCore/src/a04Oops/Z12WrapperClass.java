package a04Oops;

public class Z12WrapperClass {
	public static void main(String[] args) {
		int num = 10;
		Integer num1 = num;            //auto-Boxing  //storing primitive value in non-primitive object
		int num2 = num1;               //auto-unboxing
		
		String str = "12";
		int num3 = Integer.parseInt(str);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
