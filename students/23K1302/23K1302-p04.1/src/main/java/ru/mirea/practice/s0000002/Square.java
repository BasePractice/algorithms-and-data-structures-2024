package ru.mirea.practice.s0000002;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + ", Сторона: " + side;
    }
}
