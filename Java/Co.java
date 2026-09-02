class Co {
    Co()
    {
        System.out.println("Default Constructor");
    }
    Co(int a, int b)
    {
        System.out.println("The Sum is = " + (a+b));
    }
    public static void main(String[] args) {
        Co c1 = new Co();
        Co c2 = new Co(2,4);
    }
}
