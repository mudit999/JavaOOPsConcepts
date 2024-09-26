package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //We can put an object of child class in a variables that takes parent type
        // B - Child class
        // A - Parent class

        List<A> ls = new ArrayList<>();

        ls.add(new A());
        ls.add(new B());
        ls.add(new A());

        for(A obj : ls){
            obj.doSomething();
        }
    }
}
