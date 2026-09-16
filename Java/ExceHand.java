public class ExceHand {
    public static void main(String[] args) {
        try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a/b;
        System.out.println("The division is = " + c);
        }
        catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
