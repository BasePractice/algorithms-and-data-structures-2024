package ru.mirea.practice.s23f0011.task2;

class Student {
    private final String name;
    private final double avg;

    public Student(String name, double avg) {
        this.name = name;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return avg;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", avg=" + avg + '}';
    }
}
