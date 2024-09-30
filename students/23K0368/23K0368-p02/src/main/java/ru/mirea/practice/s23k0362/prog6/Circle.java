package ru.mirea.practice.s23k0362.prog6;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double lenOkr(double radius) {
        return 2 * PI * radius;
    }

    public double square(double radius) {
        return PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", len_okr=" + lenOkr(radius) + ", square=" + square(radius) + '}';
    }
}
