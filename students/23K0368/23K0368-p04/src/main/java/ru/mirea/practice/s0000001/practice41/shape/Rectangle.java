package ru.mirea.practice.s0000001.practice41.shape;

class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 10;
        this.length = 10;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "width=" + width
                + ", length=" + length
                + ", color='" + getColor() + '\''
                + ", filled=" + isFilled()
                + '}';
    }

    public double getSide() {
        return getWidth();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return this.length;
    }
}
