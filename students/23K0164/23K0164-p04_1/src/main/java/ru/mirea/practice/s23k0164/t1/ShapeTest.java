package ru.mirea.practice.s23k0164.t1;


public final class ShapeTest {

    private ShapeTest() {

    }

    public static void main(String[] args) {
        Share[] shapes = new Share[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Share shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
