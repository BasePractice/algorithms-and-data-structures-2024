package ru.mirea.practice.s0000001.abstr;

public class Circ1 extends Shape {
    protected double radius;

    public Circ1(double radius,String color,Boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString() {
        return "radius=" + radius + ",color=" + color + "filled=" + filled;
    }
}
