package ru.mirea.practice.s0000001.task3;

public class Point {
    private double x;
    private double y;

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void setPos(double[] pos) {
        this.x = pos[0];
        this.y = pos[1];
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ",y=" + y + "}";
    }

}
