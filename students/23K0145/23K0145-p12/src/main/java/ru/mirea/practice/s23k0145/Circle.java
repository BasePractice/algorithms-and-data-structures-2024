package ru.mirea.practice.s23k0145;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, String position, double radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
