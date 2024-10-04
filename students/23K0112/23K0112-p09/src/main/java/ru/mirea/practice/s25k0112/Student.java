package ru.mirea.practice.s25k0112;

public class Student {
    public String name;
    public int id;
    private double gpa;

    public  Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", Id: " + id + ", GPA: " + gpa + "}";
    }
}
