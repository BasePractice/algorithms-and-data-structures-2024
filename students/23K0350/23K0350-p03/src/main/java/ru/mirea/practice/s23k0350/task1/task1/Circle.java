package ru.mirea.practice.s23k0350.task1.task1;

class Circle {
    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    public float getLength() {
        return 2 * (float) Math.PI * radius;
    }
}
