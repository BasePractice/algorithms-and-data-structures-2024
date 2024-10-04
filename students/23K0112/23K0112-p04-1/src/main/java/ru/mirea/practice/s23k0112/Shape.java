package ru.mirea.practice.s23k0112;

abstract class Shape {
    public String name;
    public String color;
    public boolean filled;

    public Shape(String name, String color, boolean filled) {
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setFilled(boolean newState) {
        this.filled = newState;
    }

    public boolean isFilled() {
        return filled;
    }

    abstract double getPerimetr();

    abstract double getArea();

    @Override
    public String toString() {
        return "The shape name: " + name + "\nColor: " + color
                + "\nFilled: " + filled + "\n";
    }
}
