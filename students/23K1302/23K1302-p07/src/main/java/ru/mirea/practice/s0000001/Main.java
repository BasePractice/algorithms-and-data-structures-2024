package ru.mirea.practice.s0000001;

public final class Main {

    private Main() {
        // Пусто(
    }

    public static void main(String[] args) {

        MovableRectangle rectangle = new MovableRectangle(0, 0, 5, 5, 1, 1);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
        System.out.println("Speed Test: " + rectangle.speedtest());
    }
}
