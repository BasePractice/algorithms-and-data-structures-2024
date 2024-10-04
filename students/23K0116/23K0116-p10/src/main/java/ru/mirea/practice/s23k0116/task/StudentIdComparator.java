package ru.mirea.practice.s23k0116.task;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }
}