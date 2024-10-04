package ru.mirea.practice.s23k0359.shapes;

public abstract class Shapetester {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 15);
        Square square = new Square(20, 20);

        System.out.println(circle.getType());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(square.getType());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(rectangle.getType());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}