package a04Oops;

public class Z01ClassDemoCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 3);
        System.out.println("Sum: " + calc.privadd());
        System.out.println("Differenece: " + calc.subtract());
        System.out.println("mutiplication: " + calc.multiply());
        System.out.println("division: " + calc.divide());
    }
}
