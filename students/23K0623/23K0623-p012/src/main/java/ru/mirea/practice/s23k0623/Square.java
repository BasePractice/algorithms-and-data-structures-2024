package ru.mirea.practice.s23k0623;

public class Square extends Shape {

    public Square(double x, double y, String color) {
        super(x, y, color);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + "}";
    }
}
