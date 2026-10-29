import java.util.*;
public class AddTwoMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements in First Matrix:");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++)
                a[i][j] = in.nextInt();
        }
        System.out.println("Enter Elements in Second Matrix:");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++)
                b[i][j] = in.nextInt();
        }

        System.out.println("Addition of Matrix A and B:");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++)
                System.out.print((a[i][j]+b[i][j]) + "\t");
            System.out.println();
        }
        in.close();
    }
}
