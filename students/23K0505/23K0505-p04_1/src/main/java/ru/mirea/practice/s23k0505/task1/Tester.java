package ru.mirea.practice.s23k0505.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(10, 15);
        Square square = new Square(20);

        Shape[] shapes = {circle, rect, square};

        for (Shape shape : shapes) {
            System.out.printf("%s, %s Perimeter: %f Area: %f\n", shape.getType(), shape, shape.getPerimeter(), shape.getArea());
        }
    }
}
