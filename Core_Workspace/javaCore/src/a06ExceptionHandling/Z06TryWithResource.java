package a06ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z06TryWithResource {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a Number");
		int num = 0;
//		BufferedReader bufferedReader = null;
//		try {
//			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//			num = Integer.parseInt(bufferedReader.readLine());
//		}finally {
//			bufferedReader.close();
//			System.out.println(num);
//		}
		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
			num = Integer.parseInt(bufferedReader.readLine());
			System.out.println(num);
		}
	}
}
