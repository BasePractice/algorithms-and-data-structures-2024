package ru.mirea.practice.lab9.gpasort;

import java.util.Comparator;

public class SortStudentsByGpA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}

