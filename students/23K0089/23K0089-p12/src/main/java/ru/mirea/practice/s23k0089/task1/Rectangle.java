package ru.mirea.practice.s23k0089.task1;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(String color, int x, int y, float width, float height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }
}
