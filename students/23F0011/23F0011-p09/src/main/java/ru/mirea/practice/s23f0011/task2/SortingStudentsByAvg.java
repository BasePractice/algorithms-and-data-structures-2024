package ru.mirea.practice.s23f0011.task2;

import java.util.Comparator;

class SortingStudentsByAvg implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getAvg(), s1.getAvg());
    }
}