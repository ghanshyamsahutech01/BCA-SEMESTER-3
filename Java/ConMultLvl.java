class A {
    A()
    {
        System.out.println("Parent Class Default Constructor");
    }
}
class B extends A {
    B()
    {
        System.out.println("Intermediate Class Default Constructor");
    }
}

class ConMultLvl extends B {
    ConMultLvl()
    {
        System.out.println("Child Class Default Constructor");
    }
    public static void main(String[] args) {
        ConMultLvl c1 = new ConMultLvl();
    }
}