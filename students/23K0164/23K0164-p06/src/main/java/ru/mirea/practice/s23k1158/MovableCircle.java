package ru.mirea.practice.s23k1158;

public class MovableCircle implements Movable {
    public int radius;
    public MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public void moveUP() {
        center.moveUP();
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
        return "MovableCircle{"
                + "radius='" + radius + '\''
                + ", y='" + center + '\''
                + '}';
    }
}
