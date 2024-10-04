package ru.mirea.practice.s0000003.task1;

import java.util.Random;

public class Circle {
    private Point center;
    private double radius;


    public Circle(Point center) {
        this.center = center;
        this.radius = new Random().nextDouble() * 100; // радиус от 0 до 100
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }


    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}
