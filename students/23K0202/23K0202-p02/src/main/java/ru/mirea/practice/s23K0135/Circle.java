package ru.mirea.practice.s23K0135;

public class Circle {
    private final int radius;
    private final String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toEqual(Circle other) {
        if (this.radius < other.radius) {
            return other.name + " больше, чем " + this.name;
        } else if (this.radius > other.radius) {
            return this.name + " больше, чем " + other.name;
        } else {
            return "Радиусы (" + this.name + " и " + other.name + ") равны";
        }
    }
}
