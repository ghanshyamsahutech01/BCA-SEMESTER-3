public class ThRu implements Runnable
{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
    public static void main(String[] args) {
        ThRu t = new ThRu();
        Thread t1 = new Thread(t);
        t1.setName("100");
        t1.start();
        ThRu tt = new ThRu();
        Thread t2 =new Thread(tt);
        t2.setName("200");
        t2.start();
    }
}
