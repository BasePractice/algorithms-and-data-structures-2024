package ru.mirea.practice.s23l0908.task56;

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

    @Override
    public String toString() {
        return "Movable Point{ "
            + "x="
            + x
            + " y="
            + y
            + " xSpeed="
            + xspeed
            + " ySpeed="
            + yspeed
            + "}";
    }

    @Override
    public void moveUp() {
        System.out.print("Move up");
        y += yspeed;
    }

    public void moveDown() {
        System.out.print("Move down");
        y -= yspeed;
    }

    public void moveRight() {
        System.out.print("Move right");
        x += xspeed;
    }

    public void moveLeft() {
        System.out.print("Move Left");
        x -= xspeed;
    }
}
