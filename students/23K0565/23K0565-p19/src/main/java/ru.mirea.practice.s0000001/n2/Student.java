package ru.mirea.practice.s0000001.n2;

public class Student {
    private String fio;
    private double averageScore;

    public Student(String fio, double averageScore) {
        this.fio = fio;
        this.averageScore = averageScore;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
