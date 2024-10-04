package ru.mirea.practice.s230k754.lab4p1.task1;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.0f, 12.0f);
        Circle circle = new Circle(12.0f);
        Square square = new Square(12.0f);

        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(square.toString());
    }
}
