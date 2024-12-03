package ru.mirea.practice.s23k0755;

public class Ball {
    public double x;
    public double y;

    public Ball(double x, double y) {
        this.y = y;
        this.x = x;
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
        this.y = x;
        this.x = y;
    }

    public void move(double xdisp, double ydisp) {
        this.y = y + ydisp;
        this.x = x + xdisp;
    }

    @Override
    public String toString() {
        return "Мяч находится на позиции: " + getX() + " " + getY();
    }


}
