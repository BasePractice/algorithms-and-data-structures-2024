package ru.mirea.practice.s23k0362.practice41.shape;

public abstract class ShapeTester {
    public static void main(String[] args) {
        Circle s1 = new Circle(5.5, "RED", true);
        System.out.println("Информация о круге:");
        System.out.println("Площадь: " + s1.getArea());
        System.out.println("Периметр: " + s1.getPerimeter());
        System.out.println("Тип фигуры: " + s1.getType());
        System.out.println(s1.getRadius());


        Shape s2 = new Rectangle(1.0, 2.0, "BLUE", false);
        System.out.println("\nИнформация о прямоугольнике:");
        System.out.println(s2);
        System.out.println("Площадь: " + s2.getArea());
        System.out.println("Периметр: " + s2.getPerimeter());
        System.out.println("Тип фигуры: " + s2.getType());


        Square s3 = new Square(6.6, "GREEN", true);
        System.out.println("\nИнформация о квадрате:");
        System.out.println(s3);
        System.out.println("Площадь: " + s3.getArea());
        System.out.println("Периметр: " + s3.getPerimeter());
        System.out.println("Тип фигуры: " + s3.getType());
        System.out.println(s3.getSide());
    }
}
