package ru.mirea.practice.s0000007.task1;


public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
