package ru.mirea.practice.s23K0135.task2;

public class Circle {
    private Point center;
    private final double radius = (Math.random() + 1) * 10;

    public Circle(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle is placed in: "
                + center + "; R= "
                + radius;
    }
}
