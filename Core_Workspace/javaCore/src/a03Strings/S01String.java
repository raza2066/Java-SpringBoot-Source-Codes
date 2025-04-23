package a03Strings;

public class S01String {
    public static void main(String[] args) {
        String name = "Nadeem";
        // name = name.concat(" Raza");
        name = name + " Raza";
        //creates a new object and the previous string is now eligible for garbage collection.


        System.out.print("Hello "+name+", how are you?\nFirst letter of your surname is: ");
        System.out.println(name.charAt(7));

        String a = "abcd";
        String b = "abcd";
        //both string a and b are referring to same memory address. 
        //when we create string b it first check in string constant pool and see if the string is already present there.

        System.out.println(a==b);

        //here the == operator checks the address.
    }
}
