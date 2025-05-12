package javaStreamsProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find the longest string in a list of strings using Java streams

public class S01LongestString {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		
		String str = lst.stream()
						.min(Comparator.comparingInt(String::length))
						.orElse(null);
		System.out.println(str);
	}
}
