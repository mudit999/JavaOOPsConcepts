package Collections;

import java.util.Comparator;

public class StudentUniversityNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.universityName.compareTo(s2.universityName);
    }
}
