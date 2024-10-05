package ru.mirea.practice.s23L0908.prog1;

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
        return "MovablePoint{"
                + "x=" + x
                + ", y=" + y
                + ", xspeed=" + xspeed
                + ", yspeed=" + yspeed
                + '}';
    }
}
