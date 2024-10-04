package ru.mirea.practice.s0000001;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public String toString() {
        return "MovablePoint{x:" + x + ", y:" + y + ", xspeed:" + xspeed + ", yspeed" + yspeed + "}";
    }

    @Override
    public void moveUp() {
        this.y += yspeed;
    }

    @Override
    public void moveDown() {
        this.y -= yspeed;
    }

    @Override
    public void moveLeft() {
        this.x += xspeed;
    }

    @Override
    public void moveRight() {
        this.x -= xspeed;
    }
}
