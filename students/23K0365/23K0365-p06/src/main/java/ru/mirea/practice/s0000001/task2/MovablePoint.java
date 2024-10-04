package ru.mirea.practice.s0000001.task2;

public class MovablePoint implements Moveable {
    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
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
