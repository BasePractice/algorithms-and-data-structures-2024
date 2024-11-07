package ru.mirea.practice.s0000007.task1;

public class MovableRectangle extends Rectangle implements Movable {

    public MovableRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}