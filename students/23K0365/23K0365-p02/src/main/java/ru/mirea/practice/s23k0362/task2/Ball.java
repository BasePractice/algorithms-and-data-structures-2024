package ru.mirea.practice.s23k0362.task2;

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

    public void setXY(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void move(double ynew, double xnew) {
        this.y += ynew;
        this.x += xnew;
    }

    //@Override
    public String toString(int num) {
        return "U've got #" + num + " a ball in: \nx:"
                + x + "; y:" + y;
    }
}