package ru.mirea.practice.s23L0908.Task5_6;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Movable Circle{" +
            "radius =" + radius +
            " center{" + center + "}}";
    }

    @Override
    public void moveUp() {
        System.out.print("Circle move up");
        center.y += center.ySpeed;
    }

    public void moveDown() {
        System.out.print("Circle move down");
        center.y -= center.ySpeed;
    }

    public void moveRight() {
        System.out.print("Circle move right");
        center.x += center.xSpeed;
    }

    public void moveLeft() {
        System.out.print("Circle move up");
        center.x -= center.xSpeed;
    }
}
