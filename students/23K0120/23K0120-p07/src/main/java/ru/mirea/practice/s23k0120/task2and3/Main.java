package ru.mirea.practice.s23k0120.task2and3;

public abstract class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(2, 3, 1, 2));
        System.out.println(rectangle.isEqualspeed());
        System.out.println(rectangle);
    }
}
