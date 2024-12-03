package ru.mirea.practice.s23k0690;

public class Student implements Comparable<Student> {
    private int id;
    private String fio;
    private double averageScore;

    Student(int id, String fio, double averageScore) {
        this.id = id;
        this.fio = fio;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(this.getAverageScore(), s.getAverageScore());
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", fio='" + fio + "', averageScore=" + averageScore + "}";
    }
}
