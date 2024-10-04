package ru.mirea.practice.s0000002.task2;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xdisp, double ydisp) {
        this.x += xdisp;
        this.y += ydisp;
    }

    public double getArea() {
        return Math.PI * Math.pow(1, 2); // Пример: площадь с радиусом 1
    }

    @Override
    public String toString() {
        return "Ball[x=" + x + ", y=" + y + "]";
    }
}