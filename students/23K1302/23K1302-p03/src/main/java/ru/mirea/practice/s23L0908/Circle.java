package ru.mirea.practice.s23L0908;

public class Circle {
    private Point center;
    private double radius;

    // Конструктор
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Методы получения центра и радиуса
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}
