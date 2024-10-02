package ru.mirea.practice.s23k0089.task2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        // Default constructor
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y) {
        this.setXY(this.getX() + x, this.getY() + y);
    }

    @Override
    public String toString() {
        return "Ball{x: " + x + "; y: " + y + "}";
    }
}