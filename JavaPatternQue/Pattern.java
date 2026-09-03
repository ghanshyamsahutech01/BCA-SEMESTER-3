import java.util.Scanner;
public class Pattern {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row and column = ");
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==m || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
