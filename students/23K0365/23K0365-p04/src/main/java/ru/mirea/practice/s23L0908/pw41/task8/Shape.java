package ru.mirea.practice.s23L0908.pw41.task8;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public abstract double getArea();

    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        //Default conctructor
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
}
