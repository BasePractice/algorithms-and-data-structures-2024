package ru.mirea.practice.s23k0505.task3;

public class Circle {
    private Point center;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.center = new Point(centerX, centerY);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle{centerX = %.2f, centerY = %.2f, radius = %.2f}", center.getX(),center.getY(), radius);
    }
}
