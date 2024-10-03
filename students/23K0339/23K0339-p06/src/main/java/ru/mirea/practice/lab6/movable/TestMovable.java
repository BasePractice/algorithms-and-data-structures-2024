package ru.mirea.practice.lab6.movable;

public abstract class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println(circle);
    }
}

