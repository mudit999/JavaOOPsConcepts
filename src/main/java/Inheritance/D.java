package Inheritance;

public class D extends C{

    String name;
    int age;
    public D(){
        // calling the parent's constructor
        System.out.println("D's constructor called");
    }

    public D(int a){
        // calling the parent's constructor
        // super() // by default this is happening
        super("mudit");
        System.out.println("D's constructor with params is called");
    }
}
