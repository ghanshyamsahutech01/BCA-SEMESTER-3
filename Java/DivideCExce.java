public class DivideCExce {
    public static void main(String[] args) {
        try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("The division is = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Divide By Zero!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter Two Numbers!");
        }
        catch(NumberFormatException e){
            System.out.println("Enter Only Numbers!");
        }
    }
}
