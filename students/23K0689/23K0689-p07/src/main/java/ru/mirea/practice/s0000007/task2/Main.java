package ru.mirea.practice.s0000007.task2;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 0);
        MovablePoint bottomRight = new MovablePoint(10, 5);

        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);
        System.out.println(rectangle);

        rectangle.moveUp();
        rectangle.moveRight();

        System.out.println(rectangle);
    }
}
