package ru.mirea.practice.s23k0755.first;

public abstract class Shape {
    // Метод для получения типа фигуры
    public abstract String getType();

    // Метод для вычисления площади
    public abstract double getArea();

    // Метод для вычисления периметра
    public abstract double getPerimeter();

    // Переопределенный метод toString
    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}

