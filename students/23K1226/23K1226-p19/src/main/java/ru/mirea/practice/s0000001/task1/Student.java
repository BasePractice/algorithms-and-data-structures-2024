package ru.mirea.practice.s0000001.task1;

// 1. Класс Student
class Student {
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Average Score: " + averageScore;
    }
}
