package ru.mirea.practice.s23k0623;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("\n");

        MovableRectangle rectangle = new MovableRectangle(1, 3, 1, 3, 10, 5);
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
