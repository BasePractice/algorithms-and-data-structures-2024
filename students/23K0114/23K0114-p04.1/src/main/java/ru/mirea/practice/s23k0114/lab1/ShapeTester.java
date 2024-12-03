package ru.mirea.practice.s23k0114.lab1;

public final class ShapeTester {

    private ShapeTester() {

    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

