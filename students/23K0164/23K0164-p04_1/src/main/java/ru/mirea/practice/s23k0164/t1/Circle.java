package ru.mirea.practice.s23k0164.t1;

public class Circle extends Share {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return radius * Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (radius * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() + ", Радиус: " + radius;
    }
}
