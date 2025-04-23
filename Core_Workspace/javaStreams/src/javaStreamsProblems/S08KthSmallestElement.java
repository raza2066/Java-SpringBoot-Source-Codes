package javaStreamsProblems;

import java.util.Arrays;

public class S08KthSmallestElement {

	public static void main(String[] args) {
		int[] array = {4, 2, 7, 1, 5, 3, 6};
		int k = 3;
		
		int kthSmallest = Arrays.stream(array)
				                .sorted()
				                .skip(k-1)
				                .findFirst()
				                .orElse(-1);
		
		System.out.println(kthSmallest);
	}

}
