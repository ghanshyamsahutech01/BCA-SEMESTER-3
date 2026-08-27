class A {
    void Show()
    {
        System.out.println("Show Method");
    }
}

class B extends A {
    void Show1()
    {
        System.out.println("Show1 Method");
    }
}

public class Hier extends B {
    void show2()
    {
        System.out.println("Show2 Method");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.Show();
        System.out.println();
        B b1 = new B();
        b1.Show();
        b1.Show1();
        System.out.println();
        Hier h1 = new Hier();
        h1.Show();
        h1.show2();
    }
}
