package a08Collections;

import java.util.ArrayList;
import java.util.List;

public class z02List {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(5);
		
		
		System.out.println(list.get(3));
		System.out.println(list.indexOf(9));
	}
}
