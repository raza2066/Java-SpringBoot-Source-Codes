package javaStreamsProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a list of strings, find the frequency of each word using Java streams

public class S09FrequencyInList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		
		Map<String, Long> frequency = words.stream()
										   .collect( Collectors.groupingBy
												              ( Function.identity(), 
												                Collectors.counting()
												              )
												    );
		
		frequency.entrySet()
				 .stream()
				 .filter(entry->entry.getValue()>1)
				 .forEach(System.out::println);
	}
}
