package ru.mirea.practice.s23l0908;

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
        return "MovablePoint{"
            + "x="
            + x
            + ", y="
            + y
            + ", xSpeed="
            + xspeed
            + ", ySpeed="
            + yspeed
            + '}';
    }

    @Override
    public void moveUp() {
        System.out.println("Move Up!");
        y += yspeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Move Down!");
        y -= yspeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Move Left!");
        x -= xspeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Move Right!");
        x += xspeed;
    }
}
