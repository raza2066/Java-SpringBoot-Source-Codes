package a04Oops;

public class Z03StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {

        //Mobile.Type = "Smartphone";   //no need of object creation for static variables as they are common for all objects.

        //Class.forName("Mobile");                //used to load the class

        Mobile m1 = new Mobile("Samsung", 109000);

        Mobile m2 = new Mobile("Apple", 150000);

        m1.print();
        m2.print();

        Mobile.show1(m1);
    }
}
