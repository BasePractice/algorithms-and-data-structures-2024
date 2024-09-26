package ru.mirea.practice.s23k0120.task3.circle;


public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point() {
        // Default Constructor
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPolar(double r, double angle) {
        angle = angle * Math.PI / 180f;
        this.x = r * Math.cos(angle);
        this.y = r * Math.sin(angle);
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

    public Point getXY() {
        return new Point(this.getX(), this.getY());
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void move(Point point) {
        this.x += point.getX();
        this.y += point.getY();
    }

    public void rotate(double angle) {
        angle = angle * Math.PI / 180f;
        double xTemp = this.x;
        this.x = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        this.y = xTemp * Math.sin(angle) + this.y * Math.cos(angle);
    }

    @Override
    public String toString() {
        return String.format("(%.3f, %.3f", this.x, this.y);
    }
}
