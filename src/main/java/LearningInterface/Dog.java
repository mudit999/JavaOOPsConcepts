package LearningInterface;

public class Dog implements Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void talk(){
        System.out.println("Dog is talking");
    }
}

/****
 * NOTE---------------------
 *  Also, Interface is implicitly public
 *  So, when implementing it's methods, make that method also public
 */

/**
 * Now Dog class need to implement all the Animal Interface methods
 * else it will not be able to implement it.
 * */