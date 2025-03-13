package multithreading;

/*
    What is Race condition?
        A race condition happens when multiple threads "race" to access and modify the same resource
        Race conditions are particularly dangerous because they often don't appear during
        testing and can cause intermittent, hard-to-reproduce bugs in production systems.

        Solutions to race conditions:
        Synchronization: Using synchronized blocks or methods to ensure only one thread can
        access the critical section at a time
 */

class Counter{
    private int count = 0;

    // we can add synchronised keyword to fix race condition
    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i =0;i<1000;i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i =0;i<1000;i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // we must add join method to print correct results otherwise main method will print value
        // even before finishing both the thread.
        System.out.println(counter.getCount());
    }
}
