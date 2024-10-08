package ru.mirea.practice.s23K0135.task1;

class MovableCircle extends MovablePoint {
    private int radius;

    public MovableCircle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
