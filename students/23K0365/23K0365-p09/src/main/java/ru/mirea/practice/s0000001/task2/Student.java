package ru.mirea.practice.s0000001.task2;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int gpa;

    public Student(int gpa, String name) {
        this.name = name;
        this.gpa = gpa;
    }

    public int getgpa() {
        return gpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getgpa() - o2.getgpa();
    }

    @Override
    public String toString() {
        return "Student:\n"
                + "gpa=" + gpa
                + ", name - " + name;
    }
}

