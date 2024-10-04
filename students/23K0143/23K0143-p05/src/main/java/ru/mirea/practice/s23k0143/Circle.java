package ru.mirea.practice.s23k0143;

class Circle extends Shape {
    private double radius;

    public Circle(String color, Point position, double radius) {
        super(color, position);
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

    public double getRadius() {
        return radius;
    }
}