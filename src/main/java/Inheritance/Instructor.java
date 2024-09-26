package Inheritance;

public class Instructor extends User {

    public Instructor(){
        System.out.println("Instructor constructor called");
    }

    double avgRating;
    void scheduleClass() {
        System.out.println("Instructor has scheduled the class");
    }

}
