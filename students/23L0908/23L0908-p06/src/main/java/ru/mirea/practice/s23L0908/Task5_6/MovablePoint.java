package ru.mirea.practice.s23L0908.Task5_6;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Movable Point{ " +
            "x=" + x +
            " y=" + y +
            " xSpeed=" + xSpeed +
            " ySpeed=" + ySpeed + "}";
    }

    @Override
    public void moveUp() {
        System.out.print("Move up");
        y += ySpeed;
    }

    public void moveDown() {
        System.out.print("Move down");
        y -= ySpeed;
    }

    public void moveRight() {
        System.out.print("Move right");
        x += xSpeed;
    }

    public void moveLeft() {
        System.out.print("Move Left");
        x -= xSpeed;
    }
}
