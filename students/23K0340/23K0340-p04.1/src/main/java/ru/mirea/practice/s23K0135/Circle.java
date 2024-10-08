package ru.mirea.practice.s23K0135;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 0.0;
        this.color = "";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{radius: " + radius + ",color: " + color + ",filled: " + filled + "}";
    }
}
