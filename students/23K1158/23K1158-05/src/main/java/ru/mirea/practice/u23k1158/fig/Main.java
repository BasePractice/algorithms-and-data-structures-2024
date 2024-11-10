package ru.mirea.practice.u23k1158.fig;

public abstract class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10,20,"Красный");
        Rectangle rectangle = new Rectangle(10,10, "Синий");
        Triangle triangle = new Triangle(-10, -10, "Зеленый");

        circle.shape();
        rectangle.shape();
        triangle.shape();

    }
}
