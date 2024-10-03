package ru.mirea.practice.s23k0130.figure;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void shape();

}
