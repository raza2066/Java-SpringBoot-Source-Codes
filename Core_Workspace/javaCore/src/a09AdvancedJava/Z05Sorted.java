package a09AdvancedJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Z05Sorted {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8,6,9,7,5,4,1,3,2,0);
		
		Stream<Integer> stream = list.stream()
											.filter(n->n%3!=0)
											.map(n->n*3)
											.sorted();
		
		stream.forEach(n->System.out.print(n+" "));
	}
}
