package ru.mirea.practice.s0000009.task2;

public final class Student {

    private String name;
    private double gpa;

    // Конструктор с параметрами
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Метод для получения имени студента
    public String getName() {
        return name;
    }

    // Метод для получения среднего балла (GPA)
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}