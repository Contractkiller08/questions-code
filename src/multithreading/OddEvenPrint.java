package multithreading;

/*
    make two thread using lambda. one thread prints even number from 2 to 10 and
    other odd
 */
public class OddEvenPrint {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=2;i<1000;i+=2){
                System.out.println("Thread1 : "+i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1;i<1000;i+=2){
                System.out.println("Thread2 : " + i);
            }
        });

        t1.start();
        t1.join();
        // join is used so that t1 can process first then t2 can start. sequential basically

        t2.start();
    }
}
