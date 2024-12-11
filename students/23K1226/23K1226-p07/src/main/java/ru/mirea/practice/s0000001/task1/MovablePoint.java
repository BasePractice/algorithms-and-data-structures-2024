package ru.mirea.practice.s0000001.task1;

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int speed;

    public MovablePoint(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void moveUp() {
        y += speed;
    }

    public void moveDown() {
        y -= speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
