package ru.mirea.practice.s0000001.task1;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Shape: " + getType()
                + ", Side: " + super.getArea()
                + ", Area: " + String.format("%.2f", getArea())
                + ", Perimeter: " + String.format("%.2f", getPerimeter());

    }
}

