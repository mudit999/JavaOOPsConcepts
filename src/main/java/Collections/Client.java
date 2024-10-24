package Collections;

import java.util.*;

public class Client {
    /*
    Collection interface is the root interface in the Collection heirarchy
    Mainly 3 interfaces - List, Set and Queue extends the collections interface
     */

    public static void main(String[] args) {
        /*
        List Interface - ArrayList, LinkedList, Vector, Stack

        List is ordered collection of elements. Elements remain in the same order you inserted.
         */

        /*
        Array List - Implemented using arrays
        Resizeable
        Not thread safe, avoid using array list in multithreaded environment
         */
        List<String> ls = new ArrayList<>();
        ls.add("Umang");
        ls.add("Kavyankit");
        ls.add("Omar");
        ls.add("Nikhil");
        System.out.println(ls);

        /*
        LinkedList - Implemented using Doubly Linked List
        Not thread safe
        Random access using index is slower in LinkedList as compared to ArrayList
         */
        List<String> ls2 = new LinkedList<>();
        /*
        Vector - Thread safe, preferable in multi-threaded environment
         */
        List<String> ls3 = new Vector<>();

        /*
        Stack - works on LIFO principle
        Extended from Vector class
        Thread safe
         */
        List<String> ls4 = new Stack<>();

        /*
        Set Interface
        Not thread safe
        Contains only unique elements
        constant time operations for insertions, deletions, search - O(1)
         */

        /*
        HashSet - No order confirmation, random
         */
        Set<String> st1 = new HashSet<>();
        st1.add("Umang");
        st1.add("Kavyankit");
        st1.add("Omar");
        st1.add("Nikhil");
        /*
        LinkedHashSet - Order will be retained
         */
        Set<String> st2 = new LinkedHashSet<>();
        st2.add("Umang");
        st2.add("Kavyankit");
        st2.add("Omar");
        st2.add("Nikhil");
        /*
        Order will be natural ordering
         */
        Set<String> st3 = new TreeSet<>();
        st3.add("Umang");
        st3.add("Kavyankit");
        st3.add("Omar");
        st3.add("Nikhil");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        /*
        EnumSet?
        Enums are nothing but constants. Whenever we have defined set of strings

         */

        Payment p1 = new Payment();
        p1.status = PaymentStatus.APPROVED;

        Payment p2 = new Payment();
        p2.status = PaymentStatus.FAILED;

        /*
        ENUMSET - enum set is used to create set of enums
         */

        Set<PaymentStatus> s4 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(s4);

        EnumSet<PaymentStatus> s5 = EnumSet.of(PaymentStatus.APPROVED, PaymentStatus.FAILED);
        System.out.println(s5);

        EnumSet<PaymentStatus> s6 = EnumSet.complementOf(s5);
        System.out.println(s6);


        /*
        Queue Interface
        Works on the principle of FIFO
         */

        /*
        Comparators for custom sorting
        To disturb the natural ordering
        Priority queue can also accept comparator in the constructor

        Comparator - (Sorting classes in DSA)
        -1 - first param should come first in the final order
        1 - second param should come first in the final order
        0 - anybody can come first in the final order
         */

        Queue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
                //if t1 < s, negative value => s will come first
                //if t1 > s, positive value => t1 comes first
                //disturbed natural ordering
            }
        });

        q.add("Umang");
        q.add("Kavyankit");
        q.add("Swathi");
        q.add("Bina kar");
        q.add("Nikhil");

        /*
        Heaps - Max heap, min heap
        In java, pq is min heap by default
        PQ gives you the min element in O(1)
        PQ is a almost complete binary tree
         */

        while(!q.isEmpty()){
            System.out.println(q.peek()); //accessing the root element
            q.poll(); //removing the top element
        }
        /*
        I want to make it work like a max heap
        access the max element always
         */

        /*
        Comparator and Comparable interface
         */


        /*
        Comparator can be passed in second param in sort method
        for custom sorting
         */

        Collections.sort(ls); // lexicographically sort
        System.out.println("List below is :- ");
        System.out.println(ls);

        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);

            // compareTo
            // the value 0 if the argument string is equal to this string;
            // a value less than 0 if this string is lexicographically less than the string argument;
            // and a value greater than 0 if this string is lexicographically greater
            // than the string argument.

            /*
                num1.compareTo(num2)
                -> if num1 < num2 -> returns -ve value
                -> if num2 < num1 -> returns +ve value
             */

            }
        });


        Student std1 = new Student("Umang", 29, "ABC");
        Student std2 = new Student("Sahil", 10, "XYZ");
        Student std3 = new Student("Tripti", 29, "AZC");

        List<Student> ls5  = new ArrayList<>();
        ls5.add(std1);
        ls5.add(std2);
        ls5.add(std3);

        Collections.sort(ls5);
        // here ls5 has user defined object
        // if comparator is not passed, then sorting must be done on natural ordering
        // but for user defined class, how to know natural ordering? - use Comparable

        for(Student student: ls5){
            System.out.println(student.name + " " + student.psp + " " + student.universityName);
        }

        /*
        I want to have one more custom sorting
        sort as per university name, if same, psp
         */

        Collections.sort(ls5, new StudentUniversityNameComparator());

        for(Student student: ls5){
            System.out.println(student.name + " " + student.psp + " " + student.universityName);
        }
    }
}