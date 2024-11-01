package ru.mirea.practice.s23k0215;

public abstract class Shape {
    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Тип фигуры: " + getType();
    }
}
