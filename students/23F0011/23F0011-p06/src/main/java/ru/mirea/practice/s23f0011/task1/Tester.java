package ru.mirea.practice.s23f0011.task1;

public abstract class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 1, 3, 5);
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);
        MovableCircle circle = new MovableCircle(point, 3);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle);
    }
}
