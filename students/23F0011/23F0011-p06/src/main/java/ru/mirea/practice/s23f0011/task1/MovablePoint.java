package ru.mirea.practice.s23f0011.task1;

public class MovablePoint {
    private int x;
    private int y;
    private final int xspeed;
    private final int yspeed;

    MovablePoint(int x, int y, int xspeed, int yspeed) {
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

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xspeed + ", ySpeed=" + yspeed + '}';
    }
}
