package ru.mirea.practice.s230k754.lab9.task2;

import ru.mirea.practice.s230k754.lab9.task1.Student;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getIdNumber(), o1.getIdNumber());
    }

    public int compare(Student o1, Student o2, String name) {
        return Integer.compare(o2.getIdNumber(), o1.getIdNumber());
    }

}
