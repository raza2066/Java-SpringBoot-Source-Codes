package a09AdvancedJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.stream.Stream;

public class Z04Reduce {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,9,8,3,6,4);
		list.forEach(n ->System.out.print(n+" "));                                   //we can use lambda expression
	
		System.out.println("\n=============");
//		
//		int result = list.stream()
//									.filter(n->n%2==0)
//									.map(n->n*2)
//									.reduce(0,(c,e)->c+e);
//		
//		System.out.println(result);
		
		

		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {      //functional Interface
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		     

		int s1 = list.stream().reduce(0,binaryOperator);
		System.out.print(s1);
		System.out.println("\n=============");

	}

}
