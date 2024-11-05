package ru.mirea.practice.s23k0087;

public class Square extends Shape {
    private final double side;

    public Square(String colour, Point position, double side) {
        super(colour, position);
        this.side = side;
    }

    public String getColour() {
        return this.colour;
    }

    public Point getPosition() {
        return this.position;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
