package Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Client {
    public static void main(String[] args) {

        // In Executor Framework we have 2 methods for thread pool
        // - newFixedThreadPool(10) -> create 10 threads
        // newCachedThreadPool -> create threads on demand

        // ExecutorService ex1 = Executors.newFixedThreadPool(10);

        ExecutorService ex2 = Executors.newCachedThreadPool();

        // - newCachedThreadPool
        //the cached thread pools creates new threads on demand
        //1 task - 1 thread
        //2 task - 2 thread
        //...

        for(int i=1; i<=100; i++){
            PrintNumber task = new PrintNumber(i);
            ex2.submit(task);
        }
    }


}
