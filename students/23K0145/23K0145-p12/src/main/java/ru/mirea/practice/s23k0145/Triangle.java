package ru.mirea.practice.s23k0145;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, String position, double base, double height) {
        super(color, position);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return 3 * base;
    }
}
