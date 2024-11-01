package ru.mirea.practice.s0000002.task3;

// Класс, представляющий окружность
public class Circle {
    private Point center; // Центр окружности
    private double radius; // Радиус окружности

    // Конструктор
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Геттеры
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[Center: %s, Radius: %.2f]", center, radius); // Форматированный вывод
    }
}