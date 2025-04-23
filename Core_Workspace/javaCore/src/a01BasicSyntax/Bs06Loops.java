package a01BasicSyntax;

public class Bs06Loops {
    public static void main(String[] args) {
        int i = 0;
        while(i<5){                          //while loop
            System.out.println("Cotton");
            i++;
        }
        
        int j=15;
        do{                                 //do-while loop
            System.out.println("For Sale");
            j--;
        }while(j>10);

        for(int l = 0; l<5; l++){           //for loop
            System.out.println("100 Rs");
        }
    }
}
