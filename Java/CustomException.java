class MyExce extends Exception {
    MyExce(){
        System.out.println("Withdraw Amount is Greater then Deposit Amount!");
    }
}
public class CustomException {
    public static void main(String[] args) {
    try{
        int dep = 50000;
        int wi = 60000;
        if (wi>dep) {
            throw new MyExce();
        }
        else
            System.out.println("After Withdrawal Balance = " + (dep-wi));
    }
    catch(MyExce e){}
    }
}
