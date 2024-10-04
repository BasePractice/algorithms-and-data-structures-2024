package ru.mirea.practice.s0000001;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        super(x, y, xspeed, yspeed);
        this.center = new MovablePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }

    public String toString() {
        return "MovacleCircle{center:" + center.toString() + ", radius:" + radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        this.center.moveDown();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        this.center.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        this.center.moveLeft();
    }
}
