package ru.mirea.practice.s0000001.task1;

public class Shape {
    public String getType() {
        return "Фигура";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}
