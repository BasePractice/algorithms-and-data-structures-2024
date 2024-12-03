package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 5, 5, 1, 1);
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
