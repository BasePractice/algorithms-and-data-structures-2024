package ru.mirea.practice.s23l0908.task;

@SuppressWarnings("unused")
public class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Calculates and returns the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public String toString() {
        return "Circle{"
            +
            "x="
            + x
            +
            ", y="
            + y
            +
            ", r="
            + r
            +
            ", colour='"
            + colour
            + '\''
            +
            '}';
    }
}
