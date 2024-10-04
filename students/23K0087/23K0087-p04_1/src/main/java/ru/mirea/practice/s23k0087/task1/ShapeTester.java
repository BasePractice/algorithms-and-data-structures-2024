package ru.mirea.practice.s23k0087.task1;

public abstract class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Тип: " + shape.getType());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
