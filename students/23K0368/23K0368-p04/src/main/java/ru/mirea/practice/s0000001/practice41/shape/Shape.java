package ru.mirea.practice.s0000001.practice41.shape;


public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this.color = "black";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getType();

    @Override
    public String toString() {
        return "Shape{"
                + "color='" + color + '\''
                + ", filled=" + filled
                + '}';
    }

}