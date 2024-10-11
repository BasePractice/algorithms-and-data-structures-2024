package ru.mirea.practice.s0000001.n1;

public class Square extends Shape {
    private final double side;

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
        return getType() + " со стороной " + side + ", площадью: " + getArea() + ", и периметром: " + getPerimeter();
    }
}