package ru.mirea.practice.s23k0350.task1;


public abstract class Shape {
    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Фигура: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}
