package ru.mirea.practice.s23k0087.task2;

public class Ball {
    private double x;
    private double y;
    
    public Ball(double x, double y) {
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(double xdisp, double ydisp) {
        x += xdisp;
        y += ydisp;
    }

    public String toString() {
        return "Ball[x = " + x + ", y = " + y + "]";
    }
}
