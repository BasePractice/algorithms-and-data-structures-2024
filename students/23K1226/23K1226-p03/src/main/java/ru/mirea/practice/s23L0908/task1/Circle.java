package ru.mirea.practice.s23L0908.task1;

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Окружность с центром в (" + center.getX() + ", " + center.getY() + ") и радиусом " + radius;
    }
}
