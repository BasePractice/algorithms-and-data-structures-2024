package ru.mirea.practice.s23k0350.task1;

public abstract class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);

        System.out.println(circle.toString() + '\n');
        System.out.println(rectangle.toString() + '\n');
        System.out.println(square.toString() + '\n');

    }
}
