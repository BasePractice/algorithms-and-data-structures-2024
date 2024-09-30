package ru.mirea.practice.s23k0362.task1;

public class Circle extends Shape {
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
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: " + getType()
                + ", Radius: " + radius
                + ", Area: " + String.format("%.2f", getArea())
                + ", Perimeter: " + String.format("%.2f", getPerimeter());

    }
}

