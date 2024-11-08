package ru.mirea.practice.s23k0505.task6;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double compareWithCircle(Circle circle) {
        return this.radius - circle.getRadius();
    }

    @Override
    public String toString() {
        return String.format("Circle{x = %.2f; y = %.2f; radius = %.2f; perimeter = %.2f; square = %.2f}",
                x, y, radius, perimeter(), square());
    }
}
