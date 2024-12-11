package ru.mirea.practice.s0000001.n1;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
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

    public String toString() {
        return "Circle with center " + center.toString() + " and radius " + radius;
    }
}