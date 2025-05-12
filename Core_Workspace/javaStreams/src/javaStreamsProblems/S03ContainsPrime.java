package javaStreamsProblems;

import java.util.Arrays;
import java.util.List;

//Check if a list of integers contains a prime number using Java streams

public class S03ContainsPrime {
	
	public static boolean prime(Integer num){
		if(num <= 1 ) {
			return false;
		}
		for(int i = 2; i*i <= num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		
		
		boolean primeNumber = numbers.stream()
			   .anyMatch(S03ContainsPrime::prime);
		
		System.out.println("Does the List COntains Prime Numbers: " + primeNumber);
		
		numbers.stream()
		.filter(S03ContainsPrime::prime)
		.forEach(num->System.out.println(num));
	}
}
