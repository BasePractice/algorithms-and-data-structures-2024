package ru.mirea.practice.s23K0135.pw41.task8;

public class Circle extends Shape {
    protected double radius;

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with "
                + "radius=" + radius
                + ". It's color is " + color + '\''
                + "(filled=" + filled + ")";
    }

    public Circle() {
        //Default conctructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
