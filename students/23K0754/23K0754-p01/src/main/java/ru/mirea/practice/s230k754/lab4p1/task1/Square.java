package ru.mirea.practice.s230k754.lab4p1.task1;

public class Square extends Shape  {
    private float side;

    public Square(float side)  {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square: " + "area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
