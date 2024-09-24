package ru.mirea.practice.s23k0120.task6.circle;

import ru.mirea.practice.s23k0120.task3.circle.Point;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(new Point(1, 2), 1);
        System.out.println(circle);
        circle.getCenter().rotate(90);
        System.out.println(circle);
        circle.getCenter().rotate(-90);
        circle.setArea(5);
        System.out.println(circle);
        circle.setCircumference(15);
        System.out.println(circle);

    }
}
