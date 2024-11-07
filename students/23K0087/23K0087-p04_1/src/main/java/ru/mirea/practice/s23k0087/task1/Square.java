package ru.mirea.practice.s23k0087.task1;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        super("Квадрат");
        this.side = side;
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
