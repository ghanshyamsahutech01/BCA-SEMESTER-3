class C {
    C()
    {
        System.out.println("Parent Class Default Constructor");
    }
}
class ConSInher extends C{
    ConSInher()
    {
        System.out.println("Child Class Default Constructor");
    }
    public static void main(String[] args) {
        ConSInher c1 = new ConSInher();
    }
}
