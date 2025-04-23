package a04Oops;

class CalculatorB {
	 
    public int add(int a, int b) {
       return a + b;
    }
 
    public int subtract(int a, int b) {
       return a - b;
    }
}

 
class AdvancedCalculator extends CalculatorB{

    public int multiply(int a, int b) {
        return a * b;
        }

    public float divide(int a, int b) {
    return (float)a / (float)b;
    }
}
class VeryAdvancedCalculator extends AdvancedCalculator{
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}

public class Z08Inheritence {
    public static void main(String[] args) {
        VeryAdvancedCalculator ac = new VeryAdvancedCalculator();
        System.out.println(ac.add(10,2));
        System.out.println(ac.subtract(10, 2));
        System.out.println(ac.multiply(10, 2));
        System.out.println(ac.divide(10, 2));
        System.out.println(ac.power(10,2));
    }
}
