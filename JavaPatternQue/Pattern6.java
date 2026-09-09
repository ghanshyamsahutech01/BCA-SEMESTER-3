import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row = ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");
            for(int j=0; j<2*i-1; j++)
                System.out.print("*");   
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");
            for(int j=0; j<2*i-1; j++)
                System.out.print("*");   
            System.out.println();
        }
    }
}
