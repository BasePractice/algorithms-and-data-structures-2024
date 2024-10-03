package ru.mirea.practice.s0000002.task1;

public abstract class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 7);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

