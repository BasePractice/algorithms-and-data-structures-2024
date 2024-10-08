package ru.mirea.practice.s23K0135;

public abstract class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial Point: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Moved Point: " + point);

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 10);
        System.out.println("Initial Circle: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Moved Circle: " + circle);
    }
}
