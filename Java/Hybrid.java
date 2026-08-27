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

class C extends B {
    void Show2()
    {
        System.out.println("Show2 Method");
    }
}

class D extends C {
    void Show3()
    {
        System.out.println("Show3 Method");
    }
}
class Hybrid extends C {
    void Show4()
    {
        System.out.println("Show4 Method");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.Show();
        System.out.println();
        B b1 = new B();
        b1.Show();
        b1.Show1();
        System.out.println();
        C c1 = new C();
        c1.Show();
        c1.Show1();
        c1.Show2();
        System.out.println();
        D d1 = new D();
        d1.Show();
        d1.Show1();
        d1.Show2();
        d1.Show3();
        System.out.println();
        Hybrid h1 = new Hybrid();
        h1.Show();
        h1.Show1();
        h1.Show2();
        h1.Show4();
    }
}
