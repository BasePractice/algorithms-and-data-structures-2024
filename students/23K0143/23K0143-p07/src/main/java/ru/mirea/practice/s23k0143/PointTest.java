package ru.mirea.practice.s23k0143;


public abstract class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0, 5.0);
        Point point2 = new Point(3.0, 4.0, 5.0);
        Point point3 = new Point(5.0, 6.0, 10.0);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);

        System.out.println("Точки 1 и 2 имеют одинаковую скорость: " + Point.speedTest(point1, point2));
        System.out.println("Точки 1 и 3 имеют одинаковую скорость: " + Point.speedTest(point1, point3));
    }
}
