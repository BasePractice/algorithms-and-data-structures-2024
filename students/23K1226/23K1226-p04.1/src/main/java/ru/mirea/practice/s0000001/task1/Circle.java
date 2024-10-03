package ru.mirea.practice.s0000001.task1;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "RED";
        this.filled = false;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", радиус = " + radius;
    }
}
