package ru.mirea.practice.s23k0145;

public abstract class Shape {
    private String color;
    private String position;

    public Shape(String color, String position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public String getPosition() {
        return position;
    }

    public abstract double area();

    public abstract double perimeter();
}
