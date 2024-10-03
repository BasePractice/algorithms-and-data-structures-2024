package ru.mirea.practice.s23k0350.task1;

public class MovablePoint7 implements Movable7 {
    public int x;
    public int y;
    public int speed;

    public MovablePoint7(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
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
}
