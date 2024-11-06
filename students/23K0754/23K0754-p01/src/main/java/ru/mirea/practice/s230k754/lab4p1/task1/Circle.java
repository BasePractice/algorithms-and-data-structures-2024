package ru.mirea.practice.s230k754.lab4p1.task1;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + "area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
