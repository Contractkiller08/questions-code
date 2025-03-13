package multithreading;

/*
    1. What is Thread?
        A thread is the smallest unit of execution within a process.
        It represents an independent path of execution that can run concurrently with other threads within the same process.

    Key Points:
        •	A process can have multiple threads, sharing the same memory space.
        •	Each thread has its own stack, program counter, and registers but shares heap memory with other threads in the same process.
        •	In Java, threads can be created using:
            •	Extending the Thread class.
            •	Implementing the Runnable interface.
            •	Using the ExecutorService framework for better thread management.
 */

class MyThread extends Thread{
    //The run() method holds the logic that will be executed in a thread when start() is called.
    //It is defined in the Runnable interface and overridden when implementing a thread.
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Created using thread class");
        }
    }
}

class RunnableThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Created using Runnable interface");
        }
    }
}
public class Basic {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        RunnableThread obj = new RunnableThread();
        Thread t2 = new Thread(obj);

        t1.start();
        //execution order is not guaranteed
        // we can add join method so that thread 1 executes first then thread 2 will start

        t1.join();
        // main thread will wait for t1 to finish before starting t2
        // Definition - The join() method in Java is used to pause the execution of the current thread until the thread
        // on which join() is called has finished executing.
        t2.start();
    }
}
