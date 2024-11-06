package ru.mirea.practice.s0000007.task3;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 0, 5); // Скорость 5
        MovablePoint bottomRight = new MovablePoint(10, 5, 5); // Скорость 5

        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);
        System.out.println(rectangle);

        System.out.println("Speed test: " + rectangle.speedTest()); // Проверка скорости

        rectangle.moveUp();
        rectangle.moveRight();

        System.out.println(rectangle);
    }
}