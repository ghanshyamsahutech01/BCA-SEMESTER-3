class OverloadArea {
    void area(int a, int b)
    {
        System.out.println("Area of Rectangle = " + (a*b) + " cm");
    }
    void area(float x)
    {
        System.out.println("Area of Square = " + (x*x) + " cm");
    }
    void area(double r)
    {
        System.out.println("Area of Circle = " + (3.14*r*r) + " cm");
    }
    public static void main(String[] arg){
        OverloadArea a1 = new OverloadArea();
        a1.area(5, 9);
        a1.area(12.5f);
        a1.area(8.52);
    }
}
