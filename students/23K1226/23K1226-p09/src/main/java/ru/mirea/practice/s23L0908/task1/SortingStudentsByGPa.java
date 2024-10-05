package ru.mirea.practice.s23L0908.task1;

import java.util.Comparator;

class SortingStudentsByGPa implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
