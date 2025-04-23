package a01BasicSyntax;

public class Bs03TypeCasting {
	public static void main(String[] args) {
        byte b = 127;
        int a = 1000;
        int c = 110;

        //type casting
        b = (byte)a;
        System.out.println(b); // will lose data 
        b = (byte)c;
        System.out.println(c);
        a = (int)b;
        System.out.println(a);
    }
}
