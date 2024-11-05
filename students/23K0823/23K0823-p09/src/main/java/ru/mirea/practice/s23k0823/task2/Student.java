package ru.mirea.practice.s23k0823.task2;

class Student {
    private String name;
    private double gpa;

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
        return "Student{"
                +
                "name='"
                + name
                +
                '\''
                +
                ", gpa="
                + gpa
                +
                '}';
    }
}
