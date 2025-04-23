package a01BasicSyntax;

public class Bs05ConditionalStatements {
	public static void main(String[] args) {
        int i = 10;
        int j = 12;
        if(i>j){
            System.out.println(i);
        }
        else if(j>i){
            System.out.println(j);
        }
        else{
            System.out.println("equal");
        }

        //Ternary operator

        int n = 12;
        boolean result = n%2==0? true : false;
        System.out.println(result);

        //switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            System.out.println("Invalid");
                break;
        }
    }
}
