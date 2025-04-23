package a05Interface;

@FunctionalInterface
interface FuncInt{
	int add(int a,int b);
}
public class Z07LambdaExpression {
	public static void main(String[] args) {
//		FuncInt funcInt = (a,b)-> {return a+b;};
		FuncInt funcInt = (a,b)->  a+b;
		
		System.out.println(funcInt.add(10,12));
	}
}


/*
Lambda Expression
()->{statements;};
()->statement;
(parameters)->{statements;};
(parameters)->statement;
parameter -> {statements;};
parameter -> statements;
 */