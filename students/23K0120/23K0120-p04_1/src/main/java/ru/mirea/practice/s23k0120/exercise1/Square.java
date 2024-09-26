package ru.mirea.practice.s23k0120.exercise1;

public class Square extends Rectangle {

    public Square() {
        // Default constructor
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + width + ", filled=" + filled + ", color='" + color + '\'' + '}';
    }
}
