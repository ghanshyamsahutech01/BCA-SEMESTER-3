class UsingThis
{
    int a, b;
    void add(int a, int b){
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("Addition = " + (a+b));
    }
    public static void main(String[] args) {
        UsingThis u1 = new UsingThis();
        u1.add(10, 20);
        u1.display();
    }
}
