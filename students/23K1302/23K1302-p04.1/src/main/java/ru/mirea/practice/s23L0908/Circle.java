package ru.mirea.practice.s23L0908;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Окружность";
    }

    @Override
    public double getArea() {
        return Double.parseDouble(String.format("%.3f", Math.PI * radius * radius));
    }

    @Override
    public double getPerimeter() {
        return Double.parseDouble(String.format("%.3f", 2 * Math.PI * radius));
    }

    @Override
    public String toString() {
        return super.toString() + ", Радиус: " + radius;
    }
}
