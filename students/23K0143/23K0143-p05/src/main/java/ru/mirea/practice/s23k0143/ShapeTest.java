package ru.mirea.practice.s23k0143;

public abstract class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("red", new Point(10, 10), 5);
        Triangle triangle = new Triangle("blue", new Point(30, 30), 6, 8, 10);

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
