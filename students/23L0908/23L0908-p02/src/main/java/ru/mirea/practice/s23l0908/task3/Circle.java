package ru.mirea.practice.s23l0908.task3;

public class Circle {
    private final Point center;  // Đảm bảo 'center' không bị thay đổi
    private double radius;
    private char colour;

    @SuppressWarnings("unused")
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

    @SuppressWarnings("unused")
    public Circle(double radius) {
        this.center = new Point();
        this.radius = radius;
        this.colour = '-';
    }

    @SuppressWarnings("unused")
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
    public String toString() {
        return "Circle{"
            + "center={" + center.getX()
            + ", "
            + center.getY()
            + "}"
            + ", radius="
            + radius
            + ", colour="
            + colour
            + '}';
    }
}

