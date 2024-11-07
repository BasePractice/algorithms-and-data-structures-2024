package ru.mirea.practice.s23k0155.task1;

public abstract class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 10, 20, 5.5);
        Rectangle rectangle = new Rectangle("Blue", 15, 25, 10, 20);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}