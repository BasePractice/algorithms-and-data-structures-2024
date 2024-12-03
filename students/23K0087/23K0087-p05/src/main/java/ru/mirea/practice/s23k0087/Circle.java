package ru.mirea.practice.s23k0087;

class Circle extends Shape {
    private final double radius;

    public Circle(String colour, Point position, double radius) {
        super(colour, position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return this.colour;
    }

    public Point getPosition() {
        return this.position;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
