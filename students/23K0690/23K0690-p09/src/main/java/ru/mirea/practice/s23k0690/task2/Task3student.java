package ru.mirea.practice.s23k0690.task2;

class Task3student {
    private final String name;
    private final double avg;

    public Task3student(String name, double avg) {
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
        return "Студент: " + name + ", Балл= " + avg;
    }
}