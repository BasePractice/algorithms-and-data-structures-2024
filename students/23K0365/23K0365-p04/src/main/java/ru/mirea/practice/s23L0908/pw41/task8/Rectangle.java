package ru.mirea.practice.s23L0908.pw41.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    @Override
    public double getPerimetr() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle with "
                + "width=" + width
                + "& length=" + length
                + "It's color is " + color + '\''
                + "(filled=" + filled + ')';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
        //Default conctructor
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
}
