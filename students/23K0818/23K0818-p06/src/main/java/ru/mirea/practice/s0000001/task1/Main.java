package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        point.moveRight();
        point.moveDown();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle);
    }
}