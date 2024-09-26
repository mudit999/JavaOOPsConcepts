package Inheritance;

public class User {

    public User(){
        System.out.println("User constructor called");
    }

    String name;
    String email;

    void login() {
        System.out.println("User has logged in system");
    }
}
