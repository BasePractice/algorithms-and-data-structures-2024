package ru.mirea.practice.s0000001.task2;

public class Ball {
    private double x;
    private double y;
    private double xdelta;
    private double ydelta;

    public Ball(double x, double y, double xdelta, double ydelta) {
        this.x = x;
        this.y = y;
        this.xdelta = xdelta;
        this.ydelta = ydelta;
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

    public double getxdelta() {
        return xdelta;
    }

    public void setxdelta(double xdelta) {
        this.xdelta = xdelta;
    }

    public double getydelta() {
        return ydelta;
    }

    public void setydelta(double ydelta) {
        this.ydelta = ydelta;
    }

    public void move() {
        x += xdelta;
        y += ydelta;
    }

    public void reflectHorizontal() {
        xdelta = -xdelta;
    }

    public void reflectVertical() {
        ydelta = -ydelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + "), speed=(" + xdelta + ", " + ydelta + ")]";
    }
}