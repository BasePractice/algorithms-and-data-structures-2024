package ru.mirea.practices0000001.task2;

public class Student {
    private String fullName;
    private double averageGrade;

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
