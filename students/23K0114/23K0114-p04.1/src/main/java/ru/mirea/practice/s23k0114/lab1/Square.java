package ru.mirea.practice.s23k0114.lab1;


public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return super.toString() + " (Квадрат)";
    }
}
