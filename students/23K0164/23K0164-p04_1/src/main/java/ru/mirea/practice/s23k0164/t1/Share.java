package ru.mirea.practice.s23k0164.t1;

public abstract class Share {

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + getType() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}

