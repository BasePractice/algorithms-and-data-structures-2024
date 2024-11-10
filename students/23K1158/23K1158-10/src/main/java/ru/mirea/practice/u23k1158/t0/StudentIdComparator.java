package ru.mirea.practice.u23k1158.t0;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }
}
