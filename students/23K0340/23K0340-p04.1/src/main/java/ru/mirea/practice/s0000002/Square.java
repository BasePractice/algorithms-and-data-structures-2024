package ru.mirea.practice.s0000002;

public class Square extends Rectangle {

    public Square() {
        this.length = 0.0;
        this.color = "";
        this.filled = false;
    }

    public Square(double length) {
        this.length = length;
        this.color = "";
        this.filled = false;
    }

    public Square(double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.length = length;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square{side:" + length + ", color:" + color + ", is filled:" + filled + "}";
    }
}
