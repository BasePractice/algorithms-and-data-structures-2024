package ru.mirea.practice.s23k0164.t1;

public class Square extends Share{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return super.toString() + ", side: " + side;
    }
}

