package ru.mirea.practice.s23l0908.task56;

public class MovableCircle implements Movable {
    private final int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Movable Circle{"
            + "radius ="
            + radius
            + " center{"
            + center
            + "}}";
    }

    @Override
    public void moveUp() {
        System.out.print("Circle move up");
        center.y += center.yspeed;
    }

    public void moveDown() {
        System.out.print("Circle move down");
        center.y -= center.yspeed;
    }

    public void moveRight() {
        System.out.print("Circle move right");
        center.x += center.xspeed;
    }

    public void moveLeft() {
        System.out.print("Circle move up");
        center.x -= center.xspeed;
    }
}
