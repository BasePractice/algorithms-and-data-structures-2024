package ru.mirea.practice.s23k0120.task1;

public class Rectangle extends Shape{
    float width;
    float height;
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public float getPerimeter() {
        return (float)(width*2 + height*2);
    }

    @Override
    public float getArea() {
        return (float)(width*height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + height +
                '}';
    }
}
