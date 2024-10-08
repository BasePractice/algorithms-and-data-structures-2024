package ru.mirea.practice.s23K0135.task1;

public abstract class Shape {
    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "Shape: " + getType()
                + ", Area: " + getArea()
                + ", Perimeter: " + getPerimeter();

    }
}
