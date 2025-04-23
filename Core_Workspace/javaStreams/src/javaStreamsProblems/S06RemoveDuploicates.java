package javaStreamsProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S06RemoveDuploicates {

	public static void main(String[] args) {
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		
		numbersWithDuplicates = numbersWithDuplicates.stream()
													 .distinct()
													 .collect(Collectors.toList());
		numbersWithDuplicates.forEach(num -> System.out.println(num));
	}

}
