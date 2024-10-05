package ThreadClass;

public class Client {

    // By Default main thread is created here in psvm

    static void doSomething(){
        System.out.println("Current thread in doSomething: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("Hello");
        doSomething();

        // create a task object
        PrintSomething task1 = new PrintSomething("Hello");

        // here we are running it from main thread only
        // task1.run();

        // create a new thread, and submit a task to it
        Thread t1 = new Thread(task1);
        t1.start(); // run the thread

        // Print 1 to 100 using 100 different Thread
        for(int i=1; i<=10000; i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}


/****
 *  NOTE: We cannot control the order of execution of Threads
 */