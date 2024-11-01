package ru.mirea.practice.s230k754.lab4p1.task1;

public class Rectangle extends Shape {
    private final float xside;
    private final float yside;

    public Rectangle(float xside, float yside) {
        super("Rectangle");
        this.xside = xside;
        this.yside = yside;
    }

    @Override
    public double getArea() {
        return xside * yside;
    }

    @Override
    public double getPerimeter() {
        return xside * 2 + yside * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
