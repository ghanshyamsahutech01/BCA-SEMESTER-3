import java.util.Scanner;
import p.*;
import p.p1.*;
import p.p1.p2.*;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number to check Even or Odd = ");
        int num = in.nextInt();
        EvenOdd e1 = new EvenOdd();
        e1.checks(num);

        System.out.print("Enter two number to check Greator = ");
        num = in.nextInt();
        int num2 = in.nextInt();
        Gre g1 = new Gre();
        g1.greator_no(num, num2);

        System.out.print("Enter radius of Circle = ");
        num = in.nextInt();
        CircleArea c1 = new CircleArea();
        c1.circle(num);
        in.close();
    }
}