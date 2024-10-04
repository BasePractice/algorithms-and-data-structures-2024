package ru.mirea.practice.s23k0120.task2and3;

public class MovablePoint implements Movable {
    private final double xspeed;
    private final double yspeed;
    private double x;
    private double y;

    public MovablePoint(double x, double y, double xspeed, double yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public void moveUp() {
        this.y += yspeed;
    }

    public void moveDown() {
        this.y -= yspeed;
    }

    public void moveLeft() {
        this.x -= xspeed;
    }

    public void moveRight() {
        this.x += xspeed;
    }

    public double getxspeed() {
        return xspeed;
    }

    public double getyspeed() {
        return yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + '}';
    }
}
