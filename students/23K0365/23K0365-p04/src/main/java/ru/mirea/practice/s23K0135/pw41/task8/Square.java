package ru.mirea.practice.s23K0135.pw41.task8;

public class Square extends Rectangle {

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square with "
                + "side=" + width
                + ". It's color is " + color + '\''
                + "(filled=" + filled + ')';
    }

    public Square() {
        //Default conctructor
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
}
