package ru.mirea.practice.s23l0908.task6;

public class Circle {
    private double radius;

    /**
     * Constructs a Circle with a specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @SuppressWarnings("unused")

    public Circle() {
        this.radius = 1.0;
    }

    @SuppressWarnings("unused")
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
        return "Circle{"
            + "radius=" + radius
            + ", area=" + calculateArea()
            + ", circumference=" + calculateCircumference()
            + '}';
    }
}

