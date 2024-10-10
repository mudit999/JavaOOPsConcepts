package Generics;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Pair p = new Pair();
        // passing the data types to a class is optional
        // it will take data type as Object

        // Raw types
        HashMap map = new HashMap();
        // Java 5 support hasmap<K,V>
        // To support backward compatibility java does not remove Raw types

        map.put("wrn", 23);
        map.put(23, "ewd");

        // Generic
        Pair<Integer, String> p1 = new Pair<>();
        p1.first = 32;
        p1.second = "Nice";

        // Method level generics override the class level generic
        p1.doSomethingNonStatic("mudit", 32);

        // Method level generics
        Pair.doSomethingStatic("abc", "ade");
        Pair.doSomethingStatic("abc", 10);

        // Type defined here
        Pair.<Integer, String>doSomethingStatic(23, "Mudit");


    }
}
