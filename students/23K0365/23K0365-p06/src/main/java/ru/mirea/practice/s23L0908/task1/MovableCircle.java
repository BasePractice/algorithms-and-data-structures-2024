package ru.mirea.practice.s23L0908.task1;

public class MovableCircle implements Moveable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int  xspeed, int yspeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableCircle: "
                + "radius=" + radius
                + ", center=" + center;
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
