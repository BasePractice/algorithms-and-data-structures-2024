package ru.mirea.practice.s0000001.pw41.task1;

public class Rectangle extends Shape {
    private double x2;
    private double y2;

    public Rectangle(String name, double x, double y, double x2, double y2) {
        super(name, x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public double getArea() {
        return Math.abs((super.getX() - this.x2) * (super.getY() - this.y2));
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.abs((super.getX() - this.x2) + (super.getY() - this.y2));
    }
}