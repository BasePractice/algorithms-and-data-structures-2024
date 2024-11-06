package ru.mirea.practice.s0000001.n1;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape square = new Square(6);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}