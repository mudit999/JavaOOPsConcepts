package ThreadClass;

// Task
public class PrintNumber implements Runnable{
    int numToPrint;

    public PrintNumber(int num){
        this.numToPrint = num;
    }

    public void run(){
        System.out.println("Thread in PrintNumber" + Thread.currentThread().getName() );
        System.out.println(numToPrint);
    }

}
