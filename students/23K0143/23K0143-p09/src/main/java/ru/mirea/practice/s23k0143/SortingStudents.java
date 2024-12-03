package ru.mirea.practice.s23k0143;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
