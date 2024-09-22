package ru.mirea.practice.s23k0164.t1;

public class Rectangle extends Share{
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
        return super.toString() + ", Width: " + width + ", Height: " + height;
    }

}


