package ru.mirea.practice.s23k0755.first;

//import ru.mirea.practice.s23k0155.prac41.first.Square;

public abstract class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
