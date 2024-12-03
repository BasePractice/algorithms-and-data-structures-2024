package ru.mirea.practice.s0000001.task1;

public class MovableRectangle implements Movable {
    private double x;
    private double y;

    public MovableRectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRight(int x) {
        this.x += x;
    }

    @Override
    public void moveLeft(int x) {
        this.x -= x;
    }

    @Override
    public void moveUp(int y) {
        this.y += y;
    }

    @Override
    public void moveDown(int y) {
        this.y -= y;
    }

    @Override
    public String toString() {
        return "MovableRectangle: "
                + "x=" + x
                + ", y=" + y;
    }
}
