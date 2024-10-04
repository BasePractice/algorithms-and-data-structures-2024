package ru.mirea.practice.s0000001.n6;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        System.out.println("Информация о первой окружности: " + circle1);
        System.out.println("Информация о второй окружности: " + circle2);

        System.out.println("Площадь первой окружности: " + circle1.getArea());
        System.out.println("Длина первой окружности: " + circle1.getCircumference());

        System.out.println("Площадь второй окружности: " + circle2.getArea());
        System.out.println("Длина второй окружности: " + circle2.getCircumference());

        if (circle1.isEqual(circle2)) {
            System.out.println("Окружности равны.");
        } else {
            System.out.println("Окружности не равны.");
        }
    }
}