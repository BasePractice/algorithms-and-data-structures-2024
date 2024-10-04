package ru.mirea.practice.s23k0116.task1;

public abstract class Shape {

    public String getType() {
        return "Zeros Shape";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape type: " + getType();
    }
}
