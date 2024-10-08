package ru.mirea.practice.s23K0135;

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
    public String tostring() {
        return "";
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ") with speed (" + xspeed + ", " + yspeed + ")";
    }
}
