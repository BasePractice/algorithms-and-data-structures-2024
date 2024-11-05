package ru.mirea.practice.s23k0169.t1;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }
}
