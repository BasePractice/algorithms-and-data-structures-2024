package ru.mirea.practice.s230k754.lab6.task1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return super.toString() + " " + radius;
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

    public MovablePoint getCenter() {
        return center;
    }
}
