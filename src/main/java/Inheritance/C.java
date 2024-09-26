package Inheritance;

public class C extends B{
    public C(){
        System.out.println("C's constructor called");
    }

    public C(String str){
        System.out.println("C's constructor with params is called " + str);
    }
}
