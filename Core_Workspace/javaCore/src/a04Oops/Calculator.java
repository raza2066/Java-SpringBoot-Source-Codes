package a04Oops;

public class Calculator {
    private int a;
    private int b;
    
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    private int add() {
        return a + b;
    }
    
    public int privadd(){
        return add();
    }
    
    public int subtract() {
        return a - b;
    }
    
    public int multiply() {
        return a * b;
    }
    
    public float divide() {
        return (float) a / b;
    }
}
