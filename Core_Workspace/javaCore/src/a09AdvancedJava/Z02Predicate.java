package a09AdvancedJava;

//import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Z02Predicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,9,8,3,6,4);
//		list.forEach(n ->System.out.print(n+" "));                                   //we can use lambda expression
//	
//		System.out.println("\n=============");
//		
//		int result = list.stream()
//									.filter(n->n%2==0)
//									.map(n->n*2)
//									.reduce(0,(c,e)->c+e);
//		
//		System.out.println(result);
		
		
		Predicate<Integer> predicate = new Predicate<Integer>() {                 //fuctional Interface
			public boolean test(Integer t) {
				return (t%2==0)? true:false;
			}
		};
		Stream<Integer> s1 = list.stream().filter(predicate);
		s1.forEach(n->System.out.print(n+" "));
		System.out.println("\n=============");
	} 
}
