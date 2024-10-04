package ru.mirea.practice.s23k0145.lab9.task2;

public class Student {
    private int idNumber;
    private String name;
    private double gpa;

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
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
                + "idNumber=" + idNumber
                + ", name='" + name + '\''
                + ", gpa=" + gpa
                + '}';
    }
}

