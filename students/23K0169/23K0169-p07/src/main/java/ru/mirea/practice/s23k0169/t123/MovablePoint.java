package ru.mirea.practice.s23k0169.t123;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    // Параметризованный конструктор
    public MovablePoint(int x, int y, int xspeed, int yspeed) {
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

    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xspeed + ", ySpeed=" + yspeed + "]";
    }

    public boolean hasSameSpeed(MovablePoint other) {
        return this.xspeed == other.xspeed && this.yspeed == other.yspeed;
    }
}
