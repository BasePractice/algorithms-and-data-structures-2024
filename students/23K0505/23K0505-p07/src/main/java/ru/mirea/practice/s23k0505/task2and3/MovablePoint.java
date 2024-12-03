package ru.mirea.practice.s23k0505.task2and3;

public class MovablePoint implements Movable {
    private final double xSpeed;
    private final double ySpeed;
    private double x;
    private double y;

    public MovablePoint(double x, double y, double xspeed, double yspeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public void moveUp() {
        this.y += ySpeed;
    }

    public void moveDown() {
        this.y -= ySpeed;
    }

    public void moveLeft() {
        this.x -= xSpeed;
    }

    public void moveRight() {
        this.x += xSpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
}
