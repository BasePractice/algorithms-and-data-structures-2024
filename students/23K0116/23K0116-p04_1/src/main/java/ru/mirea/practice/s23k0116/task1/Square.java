package ru.mirea.practice.s23k0116.task1;

public class Square extends Rectangle {
    private final double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Rectangle: \nside: " + side
                + "\n" + "Area: " + getArea()
                + "\n" + "Perimeter: " + getPerimeter();
    }
}
