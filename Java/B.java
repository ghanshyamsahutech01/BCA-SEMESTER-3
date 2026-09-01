class A
{
    A()
    {
        System.out.println("AAA");
    }
}
class B extends A
{
    B()
    {
        System.out.println("BBB");
    }
    public static void main(String[] arg){
        B b1 = new B();
    }
}
