package ru.mirea.practice.s23L0908.practice41.shape;

class Square extends Rectangle {
    public Square() {
        this.width = 10;
        this.length = 10;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + getWidth()
                + ", color='" + getColor() + '\''
                + ", filled=" + isFilled()
                + '}';
    }

    public double getSide() {
        return getSide();
    }

}
