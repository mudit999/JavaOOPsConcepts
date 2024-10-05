package ThreadClass;

// Task
public class PrintSomething implements Runnable {
    String strToPrint;

    public PrintSomething(String str){
        this.strToPrint = str;
    }

    @Override
    public void run() {
        System.out.println("Current thread inside Task: " + Thread.currentThread().getName() );
        System.out.println(strToPrint);
    }
}
