package ru.mirea.practice.s0000001.prog5;


class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xspeed;
    public int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
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
        this.x -= xspeed;
    }

    @Override
    public void moveRight() {
        this.x += xspeed;
    }

    @Override
    public String toString() {
        return "x=" + x
                + ", y=" + y;
    }
}
