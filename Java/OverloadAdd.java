class OverloadAdd {
    void add(int a, int b)
    {
        System.out.println("The Sum = " + (a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("The Sum of Three number = " + (a+b+c));
    }
    void add(int a, float b)
    {
        System.out.println("The Sum of Integer and Float = " + (a+b));
    }
    void add(float a, int b)
    {
        System.out.println("The Sum of Float and Integer = " + (a+b));
    }
    void add(float a, float b, float c)
    {
        System.out.println("The Sum of Three float numbers = " + (a+b+c));
    }

    public static void main(String[] args) {
        OverloadAdd a = new OverloadAdd();
        a.add(12, 23);
        a.add(12,33, 45);
        a.add(34, 2.3f);
        a.add(23.5f, 23);
        a.add(4.3f, 7.8f, 5.6f);
    }
}
