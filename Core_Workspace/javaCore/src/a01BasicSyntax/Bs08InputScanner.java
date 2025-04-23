package a01BasicSyntax;

import java.util.Scanner;

public class Bs08InputScanner {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			System.out.println(num);
		}
	}
}