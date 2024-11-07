package ru.mirea.practice.s0000001.task2;

public class Student implements IStudent {
    private String fullName;
    private double averageScore;

    public Student(String fullName, double averageScore) {
        this.fullName = fullName;
        this.averageScore = averageScore;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public double getAverageScore() {
        return averageScore;
    }
}