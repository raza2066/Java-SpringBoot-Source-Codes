package a01BasicSyntax;

public class Bs04Operators {
	public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        //Arithmetic
        int result = num1+num2; 
        System.out.println(result);

        result = num1-num2;
        System.out.println(result);

        result = num1/num2;
        System.out.println(result);

        result = num1*num2;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result = num1%num2;
        System.out.println(result);

        //Relational
        boolean res = num1>=num2;
        System.out.println(res);

        res = num1==num2;
        System.out.println(res);

        //Logical
        res = num1>num2 | num1<num2;
        System.out.println(res);

        res = num1>num2 & num1<num2;
        System.out.println(res);

        res = !(num1>num2 & num1<num2);
        System.out.println(res);
    }
}
