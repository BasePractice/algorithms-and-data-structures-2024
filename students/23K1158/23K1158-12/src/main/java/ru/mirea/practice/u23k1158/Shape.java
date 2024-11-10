package ru.mirea.practice.u23k1158;

public abstract class Shape {

    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{"
                + "x='" + x + '\''
                + ", y='" + y + '\''
                + ", color='" + color + '\''
                + '}';
    }
}