package ru.mirea.practice.s23k0143;

abstract class Shape {
    protected String color;
    protected Point position;

    public Shape(String color, Point position) {
        this.color = color;
        this.position = position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public Point getPosition() {
        return position;
    }
}
