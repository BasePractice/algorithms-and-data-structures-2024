package ru.mirea.practice.s23L0908.n1;

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

    public void moveUp() {
        y += yspeed;
    }

    public void moveDown() {
        y -= yspeed;
    }

    public void moveLeft() {
        x -= xspeed;
    }

    public void moveRight() {
        x += xspeed;
    }

    public String toString() {
        return "Point (" + x + "," + y + "), Speed (" + xspeed + "," + yspeed + ")";
    }
}