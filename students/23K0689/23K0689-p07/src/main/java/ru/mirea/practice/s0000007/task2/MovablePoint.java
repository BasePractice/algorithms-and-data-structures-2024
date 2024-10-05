package ru.mirea.practice.s0000007.task2;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + "]";
    }

    // Геттеры для координат
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}