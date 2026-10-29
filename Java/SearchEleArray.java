import java.util.*;
public class SearchEleArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int flag=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Elements = ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();

        System.out.print("Enter elements for Search = ");
        int search=in.nextInt();
        int n=0;
        for(int i=0; i<arr.length; i++){
            if (search==arr[i]){
                flag=0;
                n=i;
                break;
            }
        }

        if (flag==0)
            System.out.println("Value found at index no " + n);
        else
            System.out.println("Value not found");
        in.close();
    }
}
