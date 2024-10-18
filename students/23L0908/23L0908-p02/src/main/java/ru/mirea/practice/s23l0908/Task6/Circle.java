package ru.mirea.practice.s23l0908.Task6;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be greater than 0");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean isEqual(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
            "radius=" + radius +
            ", area=" + calculateArea() +
            ", circumference=" + calculateCircumference() +
            '}';
    }
}
