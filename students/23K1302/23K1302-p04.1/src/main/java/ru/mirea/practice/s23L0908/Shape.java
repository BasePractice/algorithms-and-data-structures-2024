package ru.mirea.practice.s23L0908;

public abstract class Shape {

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}
