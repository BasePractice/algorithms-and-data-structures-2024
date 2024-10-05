package ru.mirea.practice.s23L0908;

public abstract class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,5,"Красный");
        Square square = new Square(0,-4, "Синий");
        Triangle triangle = new Triangle(-7, 10, "Зеленый");

        circle.shape();
        square.shape();
        triangle.shape();

    }
}
