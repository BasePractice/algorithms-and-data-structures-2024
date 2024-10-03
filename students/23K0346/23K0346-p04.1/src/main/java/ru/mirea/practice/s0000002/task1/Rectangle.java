package ru.mirea.practice.s0000002.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Shape: " + getType()
                + ", Width: " + width
                + ", Height: " + height
                + ", Area: " + String.format("%.2f", getArea())
                + ", Perimeter: " + String.format("%.2f", getPerimeter());

    }
}
