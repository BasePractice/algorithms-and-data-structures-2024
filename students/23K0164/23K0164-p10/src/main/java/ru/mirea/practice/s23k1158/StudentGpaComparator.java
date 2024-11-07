package ru.mirea.practice.s23k1158;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
