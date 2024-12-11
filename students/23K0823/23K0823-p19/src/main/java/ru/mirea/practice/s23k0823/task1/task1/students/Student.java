package ru.mirea.practice.s23k0823.task1.task1.students;

public class Student {
    private String fio;
    private double averageMark;

    public Student(String fio, double averageMark) {
        this.fio = fio;
        this.averageMark = averageMark;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
