package ru.mirea.practice.s0000001.pw41.task1;

public class Square extends Shape{
    private double x2;
    private double y2;

    public Square(String name, double x, double y, double x2, double y2) {
        super(name, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double getArea() {
        return Math.abs((super.getX() - this.x2)*(super.getX() - this.x2));
    }

    @Override
    public double getPerimetr() {
        return 4 * Math.abs(super.getX() - this.x2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}