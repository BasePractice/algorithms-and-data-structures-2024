package ru.mirea.practice.s23L0908.task5;

public class MovablePoint extends Shape implements Movable {
    public MovablePoint(double x, double y) {
        super(x, y);
    }

    @Override
    public void moving(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println("Moved to (" + this.x + ", " + this.y + ")");
    }
}
