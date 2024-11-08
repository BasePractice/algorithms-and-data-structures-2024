package ru.mirea.practice.s23k0690.task2;

public abstract class Task2Test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 0, 0);
        rectangle.printPosition();
        for (int i = 0;i < 10;i++) {
            rectangle.moveRight();
            rectangle.moveDown();
            rectangle.moveUp();
            rectangle.moveLeft();
            rectangle.moveLeft();
            rectangle.moveDown();
            rectangle.moveUp();
        }
        System.out.println("\n");
        rectangle.printPosition();
    }
}