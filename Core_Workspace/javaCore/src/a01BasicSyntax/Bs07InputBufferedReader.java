package a01BasicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bs07InputBufferedReader {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a Number: ");
//		int num = 0;
//		try {
//			num = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(num);
		
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader  =  new BufferedReader(inputStreamReader);
		
		int num = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Entered Number is: "+num);
		
		bufferedReader.close();
	}
}
