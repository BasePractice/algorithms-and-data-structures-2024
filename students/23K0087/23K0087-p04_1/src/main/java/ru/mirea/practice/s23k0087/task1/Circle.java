package ru.mirea.practice.s23k0087.task1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}