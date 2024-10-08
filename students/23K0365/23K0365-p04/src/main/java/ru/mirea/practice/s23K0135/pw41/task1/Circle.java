package ru.mirea.practice.s23K0135.pw41.task1;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double x, double y, double r) {
        super(name, x, y);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI) * (r * r);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.round(Math.PI) * r;
    }
}
