package a04Oops;

class A extends Object{                               // by befault every class in java extends object class
    public A(){
        super();                                      //By default super is there even if you dont mention it
        System.out.println("constructor A called");
    }
    public A(int a){
        this();                                      //this method executes the constructor for the same class
        System.out.println("parameterized constructor A called");
    }
}

class B  extends A{
    public B(){
        super();
        System.out.println("constructor B called");
    }
    public B(int b){
        super(b);
        System.out.println("parameterized constructor B called");
    }
}//

public class Z06ThisandSuper {
    public static void main(String[] args) {
        //B obj1 = new B();
    	//B obj2 = new B(5);
     }
}
