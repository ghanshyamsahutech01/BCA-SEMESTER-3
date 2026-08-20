import java.util.Scanner;
class Bank {
    int acco_num, amount, dep_amount, wi_amount;
    String accountholder_name;
    Scanner in = new Scanner(System.in);
    void getAccountDetails()
    {
        System.out.print("Enter Account Holder Name = ");
        accountholder_name = in.next();
        System.out.print("Enter Account Number = ");
        acco_num = in.nextInt();
        System.out.print("Enter Opening Balance = ");
        amount = in.nextInt();
    }
    void deposit()
    {
        System.out.print("Enter deposit amount = ");
        dep_amount = in.nextInt();
        amount = amount + dep_amount;
        System.out.println("After deposit Account Balance = " + amount);
    }
    void withdraw()
    {
        System.out.print("Enter withdraw Amount = ");
        wi_amount = in.nextInt();
        amount = amount - wi_amount;
        System.out.println("After Withdraw Account Balance = " + amount);
    }
    void checkbalance()
    {
        System.out.println("Account Balance = " + amount);
    }
    public static void main(String as[]) {
        Bank b1 = new Bank();
        b1.getAccountDetails();
        b1.deposit();
        b1.withdraw();
        b1.checkbalance();
    }
}
