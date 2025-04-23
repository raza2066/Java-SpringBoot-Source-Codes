package a08Collections;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection API --------------------  Framework
 * collection ------------------------  Interface
 * Collections -----------------------  Class
 * 
 * List ------------------------------  ArrayList, LinkedList etc
 * Queue -----------------------------  Dequeue etc
 * Set -------------------------------  HashSet, LinkedHashSet etc
 * Map -------------------------------  
 */

public class Z01CollectionApi {
	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);       //We can print a collection directly and dont need to print index by index
		
		for(Object n : nums) {
			System.out.println("=====."+n+".=====");
		}
	}
}
