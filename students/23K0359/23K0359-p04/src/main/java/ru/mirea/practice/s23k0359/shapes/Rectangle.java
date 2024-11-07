package ru.mirea.practice.s23k0359.shapes;

public class Rectangle extends Shape {
    float height;
    float width;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public float getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public float getArea() {
        return height * width;
    }
}
