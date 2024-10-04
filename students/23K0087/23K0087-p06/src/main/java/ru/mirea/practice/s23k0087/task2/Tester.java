package ru.mirea.practice.s23k0087.task2;

import ru.mirea.practice.s23k0087.task1.MovablePoint;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("\n");

        MovableRectangle rectangle = new MovableRectangle(
                new MovablePoint(5, 6, 3, 4),
                new MovablePoint(9, 11, 3, 4));
        System.out.println("Прямоугольник до перемещения: \n" + rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println("Прямоугольник после перемещения: \n" + rectangle);
    }
}
