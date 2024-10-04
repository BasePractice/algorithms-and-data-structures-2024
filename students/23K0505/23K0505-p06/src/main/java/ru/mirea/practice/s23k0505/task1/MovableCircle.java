package ru.mirea.practice.s23k0505.task1;

public class MovableCircle {
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    void moveUp() {
        center.moveUp();
    }

    void moveDown() {
        center.moveDown();
    }

    void moveLeft() {
        center.moveLeft();
    }

    void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}
