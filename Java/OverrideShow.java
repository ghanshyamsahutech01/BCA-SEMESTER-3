class A {
    void show(){
        System.out.println("Parent Class");
    }
}
class OverrideShow extends A {
    void show(){
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        A a1 = new OverrideShow();
        a1.show();
    }
}