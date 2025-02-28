Wait() method - Used for something

public class Basic {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=2;i<10;i+=2){
                System.out.println("Thread1 : "+i);
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 1;i<10;i+=2){
                System.out.println("Thread2 : " + i);
            }
        });
        
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
