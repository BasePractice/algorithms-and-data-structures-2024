package ru.mirea.practice.s23K0135.practice41.shape;

class Circle extends Shape {
    public double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", color='" + getColor() + '\''
                + ", filled=" + isFilled()
                + '}';
    }

    public Double getRadius() {
        return radius;
    }
}
