import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Elements = ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();

        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum=sum+arr[i];

        System.out.print("Sum of Array Elements = " + sum);
        in.close();
    }
}
