interface First {
    void add();
    int fi = 10;
    int fi2 = 20;
}
interface Second {
    void sub();
}

class IN implements First, Second {
    public void add(){
        System.out.println("Addition of Constant value = " + (fi+fi2));
    }
    public void sub(){
        System.out.println("Sub Method");
    }
    public static void main(String[] args) {
        IN i = new IN();
        i.add();
        i.sub();
    }
}
