package ru.mirea.practice.s23k0087.task1;

public abstract class Shape {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Фигура типа: " + getType() + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}
