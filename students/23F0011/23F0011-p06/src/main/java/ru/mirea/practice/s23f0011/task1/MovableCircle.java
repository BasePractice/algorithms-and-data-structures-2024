package ru.mirea.practice.s23f0011.task1;

public class MovableCircle {
    private final int radius;
    private final MovablePoint center;

    MovableCircle(MovablePoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}