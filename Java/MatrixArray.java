import java.util.*;
public class MatrixArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements in First Matrix:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = in.nextInt();
        }

        System.out.println("First Matrix Elements Are:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
        in.close();
    }
}
