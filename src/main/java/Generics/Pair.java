package Generics;

public class Pair<A,B> {
    A first;
    B second;

    void setFirst(A x){
        first = x;
    }

    B getSecond(){
        return second;
    }

//    static void doSomething(A x){
//        // NOTE: we can't use class level generics in static methods
//        // Bcoz type defined by object and object is not needed here
//    }


    // We can also define generic at Method level
    public static<A,B> void doSomethingStatic(A x, B y){

    }

    // Now, here method level generic will be used, instead of class level
    // A of method level is used here
    public <T, A> A doSomethingNonStatic(A x, T y){
        return x;
    }

    /*
    Method syntax -
    access modifier <generics comma separated> return type methedName (params){}
    */
}
