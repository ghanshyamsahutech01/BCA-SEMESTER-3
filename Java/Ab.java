abstract class A {
    abstract void add();
    void sub()
    {
        System.out.println("This is Sub method");
    }
}
class Ab extends A {
    void add()
    {
        System.out.println("This is an Add method");
    }
    public static void main(String[] args) {
        Ab a1 = new Ab();
        a1.add();
        a1.sub();
    }
}
