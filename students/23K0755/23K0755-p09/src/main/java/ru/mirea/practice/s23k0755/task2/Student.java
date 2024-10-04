package ru.mirea.practice.s23k0755.task2;

public class Student {
    int idNumbers;
    double gpa;

    public Student(int idNumbers, double gpa) {
        this.idNumbers = idNumbers;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: iDNumber = " + idNumbers
                + " gpa = " + gpa + "\n";
    }
}
