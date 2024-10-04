package ru.mirea.practice.s23k0089.task1;

public class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public float getPerimeter() {
        return (float) (radius * Math.PI * 2);
    }

    @Override
    public float getArea() {
        return (float) (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{radius = " + radius + '}';
    }
}
