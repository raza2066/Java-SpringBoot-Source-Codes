package a04Oops;

public class Mobile{
    String Brand;
    int Price;
    static String Type;           //static variable declaration


    //Static block executes only once. only when the clas is loaded first time
    static{                                               
        System.out.println("static block executed");
        Type = "Smartphone";
    }

    public Mobile(String brand, int price) {
        System.out.println("constructor Executed");
        Brand = brand;
        Price = price;
    }

    //static variable can be called in non static methods
    //non static variables cannot be called in static method without taking object reference as a parameter
    public static void show1(Mobile obj){
        System.out.println("static method called");
        System.out.println("Mobile [Brand: " + obj.Brand + ", Price: " + obj.Price + ", Type: " + Type + "]");
    }

    public void print() {
        System.out.println( "Mobile [Brand: " + Brand + ", Price: " + Price + ", Type: " + Type + "]" );
    }


}
