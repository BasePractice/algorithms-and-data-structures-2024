package ru.mirea.practice.s23k0089.task1;

public class Circle extends Shape {
    float radius;

    public Circle(String color, int x, int y, float radius) {
        super(color,x,y);
        this.radius = radius;
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
