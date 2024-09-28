package ru.mirea.practice.s230k754.lab3.taskmathrand.task2;

public class Circle {
    private Point point;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.point = new Point(x, y);
        this.radius = radius;
    }

    public void setPoint(double x, double y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    public double getRadius() {
        return radius;
    }
}
