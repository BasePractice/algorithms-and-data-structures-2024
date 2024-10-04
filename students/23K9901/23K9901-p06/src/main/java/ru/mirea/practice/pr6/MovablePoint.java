package ru.mirea.practice.pr6;

public class MovablePoint implements Movable {
    protected int coordX;
    protected int coordY;
    protected int speedX;
    protected int speedY;

    public MovablePoint(int coordX, int coordY, int speedX, int speedY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public void shiftUp() {
        coordY += speedY;
    }

    @Override
    public void shiftDown() {
        coordY -= speedY;
    }

    @Override
    public void shiftLeft() {
        coordX -= speedX;
    }

    @Override
    public void shiftRight() {
        coordX += speedX;
    }

    @Override
    public String toString() {
        return "MoveablePoint{coordX=" + coordX + ", coordY=" + coordY + ", speedX=" + speedX + ", speedY=" + speedY + '}';
    }
}
