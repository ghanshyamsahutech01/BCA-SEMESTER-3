import java.util.*;
public class Arr {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Elements = ");
        for(int i=0; i<arr.length; i++)
            arr[i]=in.nextInt();
        System.out.println("Elements Are:");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        in.close();
    }
}
