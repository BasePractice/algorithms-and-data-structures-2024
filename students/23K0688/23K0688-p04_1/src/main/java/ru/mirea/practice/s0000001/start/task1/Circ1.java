package ru.mirea.practice.s0000001.start.task1;

public class Circ1 extends Shape {
    private double radius;

    public Circ1(String type,double radius) {
        super(type);
        this.radius = radius;
    }

    public void setA(double radius) {
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
        return super.toString() + ",radius=" + radius;
    }
}
