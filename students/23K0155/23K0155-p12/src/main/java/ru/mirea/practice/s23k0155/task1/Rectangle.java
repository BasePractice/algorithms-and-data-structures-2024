package ru.mirea.practice.s23k0155.task1;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Реализация метода getArea() для прямоугольника
    @Override
    public double getArea() {
        return width * height;
    }

    // Реализация метода getPerimeter() для прямоугольника
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
