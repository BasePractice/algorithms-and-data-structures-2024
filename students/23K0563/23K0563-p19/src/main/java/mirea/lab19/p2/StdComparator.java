package mirea.lab19.p2;

import java.util.Comparator;

public class StdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGpa(), o2.getGpa());
    }
}
