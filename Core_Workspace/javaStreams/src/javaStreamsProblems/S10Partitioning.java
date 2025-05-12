package javaStreamsProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Implement a method to partition a list into two groups based on a predicate using Java streams

public class S10Partitioning {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
														 .collect(Collectors.partitioningBy(n->n%2==0));
		List<Integer> even = partitioned.get(true);
		List<Integer> odd = partitioned.get(false);
		
		System.out.println(even);
		System.out.println(odd);
		
		
		
	}

}
