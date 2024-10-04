package ru.mirea.practice.s0000001;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        this.y += speedY;
    }

    @Override
    public void moveDown() {
        this.y -= speedY;
    }

    @Override
    public void moveLeft() {
        this.x -= speedX;
    }

    @Override
    public void moveRight() {
        this.x += speedX;
    }
}
