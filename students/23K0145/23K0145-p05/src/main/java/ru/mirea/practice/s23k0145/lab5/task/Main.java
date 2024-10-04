package ru.mirea.practice.s23k0145.lab5.task;

public abstract class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, "Красный");
        Rectangle rectangle = new Rectangle(10, 10, "Синий");
        Triangle triangle = new Triangle(-10, -10, "Зеленый");

        circle.shape();
        rectangle.shape();
        triangle.shape();

    }
}
