package ru.mirea.practice.s23k0164.t3;

public final class Tester {

    private Tester() {

    }

    public static void main(String[] args) {
        System.out.println("Тестирование класса Point:");
        Point p1 = new Point(3, 4);
        System.out.println("Точка p1: " + p1);
        p1.setX(5);
        p1.setY(6);
        System.out.println("После изменения координат p1: " + p1);
        System.out.println("X координата p1: " + p1.getX());
        System.out.println("Y координата p1: " + p1.getY());
        Point p2 = new Point();
        System.out.println("Точка p2 (по умолчанию): " + p2);
        System.out.println("\nТестирование класса Circle:");
        Circle c1 = new Circle(p1, 2.5);
        System.out.println("Круг c1: " + c1);
        System.out.println("Центр c1: " + c1.getCenter());
        System.out.println("Радиус c1: " + c1.getRadius());
        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Длина окружности c1: " + c1.getCircumference());
        Circle c2 = new Circle(1, 1, 3);
        System.out.println("Круг c2: " + c2);
        Circle c3 = new Circle();
        System.out.println("Круг c3 (по умолчанию): " + c3);
        c3.setCenter(new Point(2, 2));
        c3.setRadius(4);
        System.out.println("После изменения c3: " + c3);
    }
}