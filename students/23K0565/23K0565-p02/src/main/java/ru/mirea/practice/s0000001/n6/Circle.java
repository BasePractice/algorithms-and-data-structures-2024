package ru.mirea.practice.s0000001.n6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean isEqual(Circle otherCircle) {
        return this.radius == otherCircle.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + getArea() + ", circumference=" + getCircumference() + '}';
    }
}