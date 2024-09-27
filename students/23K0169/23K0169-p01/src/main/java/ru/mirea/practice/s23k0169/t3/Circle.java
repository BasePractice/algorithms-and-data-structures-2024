package ru.mirea.practice.s23k0169.t3;

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
        return "Circle{Center:"
                + center +
                ", Radius:" + radius +
                '}';
    }
}
