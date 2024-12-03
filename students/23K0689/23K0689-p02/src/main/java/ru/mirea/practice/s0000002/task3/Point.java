package ru.mirea.practice.s0000002.task3;

// Класс, описывающий точку на плоскости
public class Point {
    private double x; // Координата X
    private double y; // Координата Y

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("Point(%.2f, %.2f)", x, y); // Форматированный вывод
    }
}