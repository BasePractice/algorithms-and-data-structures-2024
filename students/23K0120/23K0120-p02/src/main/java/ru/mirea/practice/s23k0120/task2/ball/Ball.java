package ru.mirea.practice.s23k0120.task2.ball;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        // Default constructor
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public void move(double x, double y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    @Override
    public String toString() {
        return "Ball{" + "x=" + x + ", y=" + y + '}';
    }
}
