package ru.mirea.practice.s23k1158;


public class MovablePoint implements Movable {

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
    public void moveUP() {
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
        return "MovablePoint{"
                + "x='" + x + '\''
                + ", y='" + y + '\''
                + ", xSpeed='" + xspeed + '\''
                + ", ySpeed='" + yspeed + '\''
                + '}';
    }
}
