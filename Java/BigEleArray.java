import java.util.*;
public class BigEleArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Elements = ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();

        int big=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>big)
                big=arr[i];
        }
        System.out.print("The Biggest Element = " + big);
        in.close();
    }
}
