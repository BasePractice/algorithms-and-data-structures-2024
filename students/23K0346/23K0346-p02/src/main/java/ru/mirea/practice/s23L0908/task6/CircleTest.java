package ru.mirea.practice.s23L0908.task6;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());

        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 1 is equal to Circle 2: " + circle1.isEqual(circle2));

        circle2.setRadius(5);
        System.out.println("After changing radius, Circle 1 is equal to Circle 2: " + circle1.isEqual(circle2));
    }
}
