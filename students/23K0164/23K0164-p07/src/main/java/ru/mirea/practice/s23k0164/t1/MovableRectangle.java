package ru.mirea.practice.s23k0164.t1;

public class MovableRectangle implements Movable {
    private int x;
    private int y;
    private int width;
    private int height;

    public MovableRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void moveUP() {
        y += 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
                + "x=" + x
                + ", y=" + y
                + ", width=" + width
                + ", height=" + height
                + '}';
    }

}
