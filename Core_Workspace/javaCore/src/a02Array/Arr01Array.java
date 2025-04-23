package a02Array;

public class Arr01Array {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7};
        int arr1[] = new int[4];

        for(int z:arr){
            System.out.print(z+" ");
        }

        System.out.println("\n**************************");
        for(int i = 0; i<4; i++){
            System.out.print(arr1[i]+" ");
        }


        for(int i = 0; i<4; i++){
            arr1[i] = 2*i+4;
        }

        System.out.println("\n**************************");
        for(int z:arr1){
            System.out.print(z+" ");
        }
    }
}
