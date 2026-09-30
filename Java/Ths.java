public class Ths extends Thread {
    public void run(){
        for(int i=6; i<=10; i++){
            
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        Ths t1 = new Ths();
        t1.setName("100");
        t1.start();
        for(int i=1; i<=5; i++){ 
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){}
        }
    }
}
