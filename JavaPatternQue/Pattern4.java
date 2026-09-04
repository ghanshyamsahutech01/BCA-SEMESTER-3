import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row = ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int j=0; j<(n-i)*2; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            for(int j=0; j<(n-i)*2; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
