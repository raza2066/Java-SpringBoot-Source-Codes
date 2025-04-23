package a08Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Z06CollectionSort2 {
	public static void main(String[] args) {
		
		Comparator<String> comparator = (i,j) -> {return (i.length()>=j.length())? 1:-1;};			
//		Comparator<String> comparator = (i, j) -> (i.length() >= j.length()) ? 1 : -1;
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("Three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("hundred");
		list.add("thousand");
		
        System.out.println("Before sorting: " + list);
        Collections.sort(list, comparator);
        System.out.println("After sorting: " + list);
	}

}
