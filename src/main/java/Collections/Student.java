package Collections;
public class Student implements Comparable<Student>{
    String name;
    double psp;
    String universityName;

    Student(String name, double psp, String universityName){
        this.psp = psp;
        this.name = name;
        this.universityName = universityName;
    }


    // Natural ordering
    // compare on psp, if psp is same, compare on name
    @Override
    public int compareTo(Student st) {
        // now some object will call this method - use this to refer that
        // obj1.compareTo(obj2)

        if(this.psp > st.psp){
            return 1;
        }else if(this.psp < st.psp){
            return -1;
        }else{
            // if psp is same
            return this.name.compareTo(st.name);
        }
    }
}