package ru.mirea.practice.s0000006.task5;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xspeed;
    int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        y += yspeed;
    }

    @Override
    public void moveDown() {
        y -= yspeed;
    }

    @Override
    public void moveLeft() {
        x -= xspeed;
    }

    @Override
    public void moveRight() {
        x += xspeed;
    }

    @Override
    public String toString() {
        return String.format("Point at (%d, %d) with speed (%d, %d)", x, y, xspeed, yspeed);
    }
}
