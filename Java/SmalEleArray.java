import java.util.*;
public class SmalEleArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Elements = ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();

        int small=arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]<small)
                small=arr[i];
        }
        System.out.print("The smallest Element = " + small);
        in.close();
    }
}
