package ru.mirea.practice.s23k0120.task1;

public class Square extends Rectangle{

    public Square(float side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                "}";
    }
}
