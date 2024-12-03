package ru.mirea.practice.s23k0087;

public abstract class ShapeTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Yellow", new Point(-4, 3), 10, 5);
        Circle circle = new Circle("Green", new Point(3, 8), 3);
        Square square = new Square("Blue", new Point(11, -9), 5);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColour());
        System.out.println("Position: " + circle.getPosition());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.getColour());
        System.out.println("Position: " + rectangle.getPosition());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("Square:");
        System.out.println("Color: " + square.getColour());
        System.out.println("Position: " + square.getPosition());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
