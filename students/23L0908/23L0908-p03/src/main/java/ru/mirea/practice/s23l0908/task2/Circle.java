package ru.mirea.practice.s23l0908.task2;

public class Circle implements Comparable<Circle> {
    Point center;
    double radius;
    char colour;

    public Circle(double x, double y, double radius, char colour) {
        this.center = new Point(x, y);
        this.radius = radius;
        this.colour = colour;
    }

    @SuppressWarnings("unused")
    public Circle(double radius, char colour) {
        this.center = new Point();
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    @SuppressWarnings("unused")
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @SuppressWarnings("unused")
    public char getColour() {
        return colour;
    }

    @SuppressWarnings("unused")
    public void setColour(char colour) {
        this.colour = colour;
    }

    @Override
    public int compareTo(Circle object) {
        return (int) (this.radius * 1000) - (int) (object.getRadius() * 100);
    }

    @Override
    public String toString() {
        return "Circle{"
            + "center ={"
            + center.getX()
            + ","
            + center.getY()
            + "}"
            + ", radius = "
            + radius
            + ", colour = "
            + colour
            + "}";

    }
}
