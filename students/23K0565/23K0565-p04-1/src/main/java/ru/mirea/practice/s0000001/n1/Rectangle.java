package ru.mirea.practice.s0000001.n1;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return getType() + " с шириной " + width + " и высотой " + height + ", площадью: " + getArea() + ", и периметром: " + getPerimeter();
    }
}