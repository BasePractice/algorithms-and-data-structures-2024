package ru.mirea.practice.s23k0362.task2;

public abstract class Shape {
    protected Color color;
    protected double x;
    protected double y;

    public Shape(Color color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "parametrs: "
                + "color='" + color
                + ", (" + x + ", "
                + y + ")";
    }
}
