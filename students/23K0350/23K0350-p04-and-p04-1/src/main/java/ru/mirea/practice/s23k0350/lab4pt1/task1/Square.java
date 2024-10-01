package ru.mirea.practice.s23k0350.lab4pt1.task1;


public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return  super.toString() + ", " + "сторона: " + getWidth() + ", ";
    }
}
