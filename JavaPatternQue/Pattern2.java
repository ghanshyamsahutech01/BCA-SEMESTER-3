import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row = ");
        int m = in.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=0; j<m-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}