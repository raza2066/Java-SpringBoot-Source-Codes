package a04Oops;

class Calculator1{
    public int add (int a, int b){
        System.out.println("method A");
        return a+b;
    }

    public int add (int a, int b, int c){
        System.out.println("method B");
        return a+b+c;
    }

    public float add (int a, float b, int c){
        System.out.println("method C");
        return a+b+c;
    }


}

public class Z02MethodOverloading {
	public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        System.out.println(calc.add(4,5));
        System.out.println(calc.add(4,5,6));
        System.out.println(calc.add(4,5.5f,6));
    }
}
