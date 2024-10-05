package ru.mirea.practice.s23k0359.shapes;

public class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
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
}
