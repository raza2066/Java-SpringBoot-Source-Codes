package a02Array;

public class Arr02MultiDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[6][];             //jagged array
        for(int i = 0; i<6; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int[] x:arr){
            for(int y:x){
                System.out.print(y+"    ");
            }
            System.out.println("\n");
        }
    }
}
