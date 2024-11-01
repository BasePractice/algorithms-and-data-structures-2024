package ru.mirea.practice.s0000001.task1;

public abstract class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
