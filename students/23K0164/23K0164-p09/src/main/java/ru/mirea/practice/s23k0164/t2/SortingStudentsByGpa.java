package ru.mirea.practice.s23k0164.t2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
