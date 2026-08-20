class Swap {
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        System.out.println("before Swaping:");
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping:");
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " + b);
        
    }
}
