package classesAndObjects;

public class Student {
    String name;
    int age;
    double psp;
    int rollNo;
    int batchId;

    void attendClass(){
        System.out.println("Studnet is attending class");
    }

    void solveAssignment(){
        System.out.println("Student is solving assignment");
    }

    void printStudentData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(psp);
        System.out.println(rollNo);
        System.out.println(batchId);
    }
}
