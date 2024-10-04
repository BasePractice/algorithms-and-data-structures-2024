package ru.mirea.practice.lab9.gpasort;

public class Student {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Имя студента = '" + name + "', gpa = " + gpa;
    }
}

