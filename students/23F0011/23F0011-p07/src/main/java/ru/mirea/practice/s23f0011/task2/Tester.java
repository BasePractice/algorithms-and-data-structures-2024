package ru.mirea.practice.s23f0011.task2;

public abstract class Tester {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(10, 20, 30, 40);
        System.out.println("Начальная позиция:");
        rectangle.printPosition();
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("\nИтоговая позиция:");
        rectangle.printPosition();
    }
}
