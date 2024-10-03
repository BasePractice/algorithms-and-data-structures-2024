package ru.mirea.practice.s230k754.lab4p1.task1;

public abstract class Shape {
    private String figure;

    public Shape(String figure) {
        this.figure = figure;
    }

    public String getType() {
        return this.figure;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
