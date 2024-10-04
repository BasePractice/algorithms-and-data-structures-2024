package ru.mirea.practice.s23k0169.math.t2;

class Circle {
    private final Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}