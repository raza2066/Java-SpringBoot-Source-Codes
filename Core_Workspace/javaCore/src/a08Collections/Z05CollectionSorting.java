package a08Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Z05CollectionSorting {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10>j%10) {
					return 1;
				}
				return -1;
			}
		};
		
		List<Integer> list = new ArrayList<>();
		list.add(61);
		list.add(30);
		list.add(99);
		list.add(32);
		list.add(88);
		list.add(47);
		list.add(24);
		list.add(06);
		list.add(25);
		list.add(13);
		
		System.out.println("Before sorting: " + list);
		
		Collections.sort(list);
		System.out.println("After sorting: " + list);
		
		Collections.sort(list, comparator);
		System.out.println("After sorting by last digit: " + list);
	}
}