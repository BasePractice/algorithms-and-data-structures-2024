package ru.mirea.practice.s23k0093;

public abstract class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("purple", new Point(4, -3), 7);
        Triangle triangle = new Triangle("green", new Point(10, 15), 4, 7, 15);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Side 2: " + triangle.getSide2());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
