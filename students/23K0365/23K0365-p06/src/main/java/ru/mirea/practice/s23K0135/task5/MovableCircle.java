package ru.mirea.practice.s23K0135.task5;

public class MovableCircle extends Shape implements Movable {
    int radius;

    @Override
    public void moving(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println("Moved to (" + this.x + ", " + this.y + ")");
    }

    public MovableCircle(double x, double y, int radius) {
        super(x, y);
        this.radius = radius;
    }
}
