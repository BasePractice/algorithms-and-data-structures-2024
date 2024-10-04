package ru.mirea.practice.s23k0089.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(3, 2);
        Square square = new Square(5);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape shape : shapes) {
            System.out.printf("%s, %s Perimeter: %f Area: %f\n", shape.getType(), shape, shape.getPerimeter(), shape.getArea());
        }
    }
}
