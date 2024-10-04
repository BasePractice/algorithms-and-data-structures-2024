package ru.mirea.practice.s0000001.task5;

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
