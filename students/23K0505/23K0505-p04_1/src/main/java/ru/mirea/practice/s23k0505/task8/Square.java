package ru.mirea.practice.s23k0505.task8;

public class Square extends Rectangle {

    public Square() {
        // Default constructor
    }

    public Square(float side) {
        super(side, side);
    }

    public Square(float side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "side=" + width + ", filled=" + filled + ", color='" + color + '\'' + '}';
    }
}
