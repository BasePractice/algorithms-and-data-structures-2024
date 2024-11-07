package ru.mirea.practice.s23k0155.task1;


class Circle extends Shape {
    private double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Реализация метода getArea() для круга
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Реализация метода getPerimeter() для круга
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}