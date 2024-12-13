package ru.mirea.practice.s0000001.num2;

public class Student {
    String n;
    int id;
    double gpa;

    public Student(String n, int id, double gpa) {
        this.n = n;
        this.id = id;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return n;
    }
}
