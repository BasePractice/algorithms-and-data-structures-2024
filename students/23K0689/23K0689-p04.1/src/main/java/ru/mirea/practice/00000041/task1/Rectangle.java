package ru.mirea.practice.s0000001.task1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Конструктор, принимающий два параметра: длина и ширина
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Длина: " + length + ", Ширина: " + width + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}