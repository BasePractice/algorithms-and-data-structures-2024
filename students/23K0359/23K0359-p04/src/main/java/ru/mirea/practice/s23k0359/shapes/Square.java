package ru.mirea.practice.s23k0359.shapes;

public class Square extends Rectangle {

    public Square(float width, float height) {
        super(width, height);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public float getPerimeter() {
        return height * 4;
    }

    @Override
    public float getArea() {
        return height * height;
    }
}
