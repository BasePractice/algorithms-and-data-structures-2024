package ru.mirea.practice.s23k0169.t1;

public final class ShapeTester {

    private ShapeTester() {

    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6), new Square(3)};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
