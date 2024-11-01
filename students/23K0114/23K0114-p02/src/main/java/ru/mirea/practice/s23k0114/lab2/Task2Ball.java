package ru.mirea.practice.s23k0114.lab2;

public class Task2Ball {
    private double x;
    private double y;

    public Task2Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xdisp,double ydisp) {
        this.x = x + xdisp;
        this.y = y + ydisp;
    }

    @Override
    public String toString() {
        return "Ball{x=" + x + ",y=" + y + "}";
    }

}
