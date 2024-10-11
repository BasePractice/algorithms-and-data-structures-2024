package ru.mirea.practice.s23k0087.task1;

public class MovableCircle implements Movable {
    private final MovablePoint center;
    private final int radius;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle(" + center.toString() + ",radius=" + radius + ")";
    }
}
