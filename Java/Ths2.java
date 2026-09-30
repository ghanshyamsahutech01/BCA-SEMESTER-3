public class Ths2 extends Thread {
    public void run(){
        for(int i=6; i<=10; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        Ths2 t1 = new Ths2();
        t1.setName("100");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){}
        for(int i=1; i<=5; i++){ 
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){}
        }
    }
}

