package ru.mirea.practice.s23k0116.movable1;

public abstract class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println(point);

        System.out.println("\n");

        MovableCircle circle = new MovableCircle(0, 0, 3, 3, 10);
        System.out.println(circle);
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);
    }
}
