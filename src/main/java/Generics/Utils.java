package Generics;

import java.util.List;

public class Utils {
    public static void simpleDoSomething(Animal animal){

    }

    public static void doSomething(List<Animal> animals){
        // If I pass List of Dog in method
        // then this will not be possible

        // animals.add(new Cat());

        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }

    /*
        Dog is an animal
        List<Dog> is not List<Animal>
    */



    // ? - Anything
    // Here We are sure that will not do anything specific to Dog, Cat
    public static void doSomethingModified(List<? extends Animal> animals){
        for(Animal animal : animals){
            System.out.println(animal.name);
        }
    }

    // Way 2 - writing above method
    // accepts List of Animal and it's children
    // Here we have given name to datatype - T
    // now we can also return it
    public static <T extends  Animal> List<T> doSomethingModified2(List<T> animals){
        return animals;
    }
}
