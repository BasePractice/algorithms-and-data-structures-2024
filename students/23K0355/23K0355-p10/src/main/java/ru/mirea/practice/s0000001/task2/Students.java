package ru.mirea.practice.s0000001.task2;

public class Students {
    private String n;
    private double g;

    public Students(String n, double g) {
        this.n = n;
        this.g = g;
    }

    public String getN() {
        return n;
    }

    public double getG() {
        return g;
    }

    @Override
    public String toString() {
        return "Student{n='" + n + "', g=" + g + "'}";
    }
}