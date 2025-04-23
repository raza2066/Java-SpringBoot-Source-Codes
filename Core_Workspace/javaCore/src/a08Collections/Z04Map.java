package a08Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Z04Map {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();            // we can use HashTable
																		//HashTable is synchronized while HashMap is not.
		marks.put("Raza", 23);
		marks.put("Tanveer", 3);
		marks.put("Ayan", 100);
		marks.put("Huzaifa", -2);

		marks.put("Huzaifa", -69);
		 
		System.out.println(marks);
		System.out.println(marks.get("Raza"));
		System.out.println("================================");
		
		System.out.println(marks.values());
		Set<String> names = marks.keySet();  
		System.out.println(names);
		System.out.println("================================");
		
		for(String name : names) {
			System.out.println(name+": "+marks.get(name)+" ");
		}
	}

}
