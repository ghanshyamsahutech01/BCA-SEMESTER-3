class A {
    void show()
    {
        System.out.println("Show Method");
    }
}
public class Single_Inher extends A{
    void show1()
    {
        System.out.println("Show1 Method");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
        Single_Inher b1 = new Single_Inher();
        b1.show1();
    }
}