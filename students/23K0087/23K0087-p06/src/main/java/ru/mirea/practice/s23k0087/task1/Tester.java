package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Начальная позиция точки: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Позиция точки после перемещения: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 3);
        System.out.println("\nНачальная позиция круга: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Позиция круга после перемещения: " + circle);
    }
}
