package ru.mirea.practice.s0000001.abstr;

public class Rect1 extends Shape {
    protected double width;
    protected double length;

    public Rect1(String color,Boolean filled,double width,double length) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public Rect1(String color, Boolean filled) {
        super(color,filled);
    }

    public double getWidth(double width) {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(double length) {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimetr() {
        return width * 2 + length * 2;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return "width=" + width + ",length=" + length + ",color=" + color + "filled=" + filled;
    }
}
