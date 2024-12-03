package ru.mirea.practice.s23k0164.t2;

public class Student {
    private String name;
    private int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name
                + '\'' + ", gpa=" + gpa
                + '}';
    }
}
