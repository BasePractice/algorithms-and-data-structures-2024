package ru.mirea.practice.s23L0908.task6;

class Circle {
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

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean isEqual(Circle other) {
        return this.radius == other.radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
