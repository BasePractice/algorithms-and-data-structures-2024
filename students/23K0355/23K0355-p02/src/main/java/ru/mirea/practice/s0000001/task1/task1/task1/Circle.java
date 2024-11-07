package ru.mirea.practice.s0000001.task1.task1.task1;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Круг(центр: " + center + ", радиус: " + radius + ")";
    }
}
