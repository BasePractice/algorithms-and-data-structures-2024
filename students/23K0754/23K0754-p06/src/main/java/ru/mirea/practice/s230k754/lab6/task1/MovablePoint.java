package ru.mirea.practice.s230k754.lab6.task1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xspeed;
    private int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + xspeed + " " + yspeed;
    }

    @Override
    public void moveUp() {
        /*  */
    }

    @Override
    public void moveDown() {
        /*  */
    }

    @Override
    public void moveLeft() {
        /*  */
    }

    @Override
    public void moveRight() {
        /*  */
    }
}
