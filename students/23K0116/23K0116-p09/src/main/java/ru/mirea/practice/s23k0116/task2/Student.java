package ru.mirea.practice.s23k0116.task2;

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
