package ru.mirea.practice.s23k0093;

class Circle extends Shape {
    private double rad;

    public Circle(String colour, Point position, double rad) {
        super(colour, position);
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rad;
    }

    public double getRadius() {
        return rad;
    }
}
