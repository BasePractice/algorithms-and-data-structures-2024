package ru.mirea.practice.s23k0690.task1;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public void moveLeft() {
        x -= xspeed;
    }

    public void moveRight() {
        x += xspeed;
    }

    public void moveUp() {
        y += yspeed;
    }

    public void moveDown() {
        y -= yspeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXspeed() {
        return xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint "
                + "x=" + x
                + ", y=" + y
                + ", xspeed=" + xspeed
                + ", yspeed=" + yspeed;
    }
}