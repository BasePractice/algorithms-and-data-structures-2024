package ru.mirea.practice.s23k0087.task2;

public class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", GPA=" + gpa + '}';
    }
}
