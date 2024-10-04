package ru.mirea.practice.s0000001.task2;

public class MovablePoint2 implements Movable {
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint2(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        y -= yspeed;
    }

    @Override
    public void moveDown() {
        y += yspeed;
    }

    @Override
    public void moveLeft() {
        x -= xspeed;
    }

    @Override
    public void moveRight() {
        x += xspeed;
    }

    public int getXspeed() {
        return xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + "]";
    }
}
