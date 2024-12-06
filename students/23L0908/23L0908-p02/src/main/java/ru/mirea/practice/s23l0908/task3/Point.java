package ru.mirea.practice.s23l0908.task3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    @SuppressWarnings("unused")
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    @SuppressWarnings("unused")
    public void setY(double y) {
        this.y = y;
    }
}
