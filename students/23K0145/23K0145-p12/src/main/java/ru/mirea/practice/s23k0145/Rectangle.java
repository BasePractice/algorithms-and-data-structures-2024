package ru.mirea.practice.s23k0145;

public class Rectangle extends Shape {
    private double width; // Ширина прямоугольника
    private double height; // Высота прямоугольника

    public Rectangle(String color, String position, double width, double height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
