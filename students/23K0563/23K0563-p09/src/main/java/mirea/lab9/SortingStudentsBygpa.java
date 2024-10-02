package mirea.lab9;

import java.util.Comparator;

public class SortingStudentsBygpa implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getgpa() - ((Student) o2).getgpa();
    }
}
