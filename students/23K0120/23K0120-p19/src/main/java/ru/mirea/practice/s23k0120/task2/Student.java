package ru.mirea.practice.s23k0120.task2;

public class Student implements Comparable {
    private String name;
    private final double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return name + " - " + averageGrade;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Double.compare(averageGrade, student.averageGrade);
    }
}
