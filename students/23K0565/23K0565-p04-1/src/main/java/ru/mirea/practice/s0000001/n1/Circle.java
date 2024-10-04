package ru.mirea.practice.s0000001.n1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
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
        return getType() + " с радиусом " + radius + ", площадью: " + getArea() + ", и периметром: " + getPerimeter();
    }
}