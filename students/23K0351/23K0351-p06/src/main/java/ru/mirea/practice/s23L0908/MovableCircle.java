package ru.mirea.practice.s23L0908;

public class MovableCircle implements Movable {
    private MovablePoint center; // Центр круга
    private int radius;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center = new MovablePoint(x, y, xspeed, yspeed);
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

    @Override
    public String toString() {
        return "MovableCircle{" + "center = " + center + ", radius = " + radius + '}';
    }
}
