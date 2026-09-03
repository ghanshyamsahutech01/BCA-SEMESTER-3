import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row = ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");   
            }
            
            /*for(int j=0; j<i; j++){ // This is my extra logic
                int sum = i+j;
                System.out.print(((i+j)%2) + " ");
            }*/
            System.out.println();
        }
    }
}