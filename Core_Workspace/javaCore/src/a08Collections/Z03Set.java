package a08Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Z03Set {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(63);
		set.add(21);
		set.add(3);
		set.add(1);
		set.add(3);
		set.add(9);
		set.add(4);
		System.out.println(set);
		
		
		Set<Integer> tset = new TreeSet<Integer>();
		tset.add(2);
		tset.add(63);
		tset.add(21);
		tset.add(3);
		tset.add(1);
		tset.add(3);
		tset.add(9);
		tset.add(4);
		
		Iterator<Integer> iterator = tset.iterator();
		System.out.print("[");
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			if (iterator.hasNext()) {
		        System.out.print(", ");
		    }
		}
		System.out.print("]");
	}

}
