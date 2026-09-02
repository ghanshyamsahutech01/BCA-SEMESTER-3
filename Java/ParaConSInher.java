class C {
    C (int a, int b)
    {
        System.out.println("The Sum of Two No = " + (a+b));
    }
}
class ParaConSInher extends C {
    ParaConSInher(int a, int b, int c)
    {
        super(a,b);
        System.out.println("The Sum of Three No = " + (a+b+c));
    }
    public static void main(String[] args) {
        ParaConSInher p1 = new ParaConSInher(2, 4, 6);
    }
}
