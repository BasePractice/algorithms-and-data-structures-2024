package ru.mirea.practice.s23K0135.pw41.task1;

public abstract class Shape {
    private String name;
    private double x;
    private double y;

    public Shape(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    public String getType() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
