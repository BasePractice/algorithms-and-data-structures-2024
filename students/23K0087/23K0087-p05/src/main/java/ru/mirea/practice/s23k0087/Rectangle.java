package ru.mirea.practice.s23k0087;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String colour, Point position, double width, double height) {
        super(colour, position);
        this.width = width;
        this.height = height;
    }

    public Point getPosition() {
        return this.position;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
