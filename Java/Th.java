public class Th extends Thread {
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
    public static void main(String[] args) {
        Th t1 = new Th();
        t1.setName("100");
        t1.start();
        Th t2 =new Th();
        t2.setName("200");
        t2.start();
    }
}
