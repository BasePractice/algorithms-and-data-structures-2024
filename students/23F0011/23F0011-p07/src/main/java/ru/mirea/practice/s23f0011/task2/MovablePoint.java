package ru.mirea.practice.s23f0011.task2;

public class MovablePoint {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

