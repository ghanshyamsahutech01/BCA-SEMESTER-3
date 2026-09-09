import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row = ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");
            for(int j=0; j<n; j++)
                System.out.print("*");   
            System.out.println();
        }
    }
}