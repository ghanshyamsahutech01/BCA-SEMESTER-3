class A {
    A(int a, int b)
    {
        System.out.println("The Sum of Two No = " + (a+b));
    }
}
class B extends A {
    B(int a, int b, int c)
    {
        super(a, b);
        System.out.println("The Sum of Three No = " + (a+b+c));
    }
}

class ParaConMultLvl extends B {
    ParaConMultLvl(int a, int b, int c, int d)
    {
        super(a, b, c);
        System.out.println("The Sum of Four No = " + (a+b+c+d));
    }
    public static void main(String[] args) {
        ParaConMultLvl c1 = new ParaConMultLvl(2,4,6,1);
    }
}