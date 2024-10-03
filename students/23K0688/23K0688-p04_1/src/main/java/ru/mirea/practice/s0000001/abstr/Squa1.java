package ru.mirea.practice.s0000001.abstr;

public class Squa1 extends Rect1 {
    private double side;

    public Squa1(String color,Boolean filled,double side) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimetr() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

    public void setWidth(double width) {
        this.side = width;
    }

    public void setLength(double length) {
        this.side = length;
    }

    public String toString() {
        return "side=" + side + ",color=" + color + "filled=" + filled;
    }
}
