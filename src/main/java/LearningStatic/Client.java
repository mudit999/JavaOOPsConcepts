package LearningStatic;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "mudit";

        Student s2 = new Student();
        s2.name = "mukul";

        System.out.println();

        Student.fee = 84383400;

        Student.universityName = "Scaler";

        System.out.println(s1.universityName);
        System.out.println(s2.universityName);

        Student.universityName = "ScalerHQ";

        System.out.println(s1.universityName);
        System.out.println(s2.universityName);

    }

}
