package ru.mirea.practice.s0000001.task2;

public class MovableRectangle implements Moveable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int xspeed, int yspeed, int x2, int y2) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: "
                + "topLeft=" + topLeft
                + ", bottomRight=" + bottomRight;
    }

    @Override
    public void moveUp() {
        System.out.println("MovedUP!");
    }

    @Override
    public void moveDown() {
        System.out.println("MovedDOWN!");
    }

    @Override
    public void moveRight() {
        System.out.println("MovedRIGHT!");
    }

    @Override
    public void moveLeft() {
        System.out.println("MovedLEFT!");
    }
}
