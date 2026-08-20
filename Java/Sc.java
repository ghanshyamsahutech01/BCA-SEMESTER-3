import java.util.Scanner;
class Sc{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = in.nextInt();
        System.out.print("Enter Second number = ");
        int b = in.nextInt();
        int c = a + b;
        System.out.println("The Sum is = " + c);
        in.close();
    }
}
