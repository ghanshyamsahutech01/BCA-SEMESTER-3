import java.util.Scanner;
class CheckPosiOrNega {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int n = in.nextInt();
        if (n > 0)
            System.out.println("Positive number");
        else if (n < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}    