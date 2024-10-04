package ru.mirea.practice.s23k0114.lab1;

public abstract class Shape {
    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Тип фигуры: " + getType();
    }
}
