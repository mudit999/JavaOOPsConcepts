package classesAndObjects;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohit";
        s1.age = 28;
        s1.psp = 70.89;
        s1.rollNo = 22;
        s1.batchId = 10;

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 27;
        s2.psp = 79.89;
        s2.rollNo = 26;
        s2.batchId = 10;

        s1.solveAssignment();
        s1.printStudentData();

        System.out.println("Done");
    }
}
