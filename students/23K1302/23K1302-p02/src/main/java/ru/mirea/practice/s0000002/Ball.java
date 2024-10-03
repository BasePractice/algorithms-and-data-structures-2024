package ru.mirea.practice.s0000002;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        // Тут ничего нет :-)
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

    public void move(double xd, double yd) {
        this.x += xd;
        this.y += yd;
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
}
