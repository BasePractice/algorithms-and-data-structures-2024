package ru.mirea.practice.s23K0135.task5;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "parametrs: "
                + ", (" + x
                + ", " + y + ")";
    }
}
