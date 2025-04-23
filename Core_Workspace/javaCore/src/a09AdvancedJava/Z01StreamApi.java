package a09AdvancedJava;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.stream.Stream;

public class Z01StreamApi {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,9,8,3,6,4);
		list.forEach(n ->System.out.print(n+" "));                                   //we can use lambda expression
		
		
//		int sum = 0;
//		for(int n:list) {
//			if(n%2==0) {
//				n=n*2;
//				sum+=n;
//			}
//		}
//		System.out.println(list);
//		System.out.println(sum);
		
		
		
		
		
		
//		Consumer<Integer> consumer = new Consumer<Integer>() {                        //Funtional Interface
//			public void accept(Integer n) {
//				System.out.print(n+" ");
//			}
//		};
//		
//		list.forEach(consumer);
//		System.out.println("\n=============");
		
		
		
		
		
		
		
		//using stream
		System.out.println("\n=============");
		
//		Stream<Integer> stream = list.stream();                                     //Stream can only be worked with once. it will be lost after that.
//		Stream<Integer> s2 = stream.filter(n->n%2==0);
//		Stream<Integer> s3 = s2.map(n->n*2);
//		int result = s3.reduce(0,(c, e)->c+e);
		
		int result = list.stream()
									.filter(n->n%2==0)
									.map(n->n*2)
									.reduce(0,(c,e)->c+e);
		
		System.out.println(result);
		
//		stream.forEach(n->System.out.print(n+" "));
//		s3.forEach(n->System.out.print(n+" "));
		
	} 
}
