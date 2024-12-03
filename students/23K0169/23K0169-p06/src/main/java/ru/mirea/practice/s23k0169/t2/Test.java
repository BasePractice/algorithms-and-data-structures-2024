package ru.mirea.practice.s23k0169.t2;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 3, 4, 1, 2, 2);
        System.out.println("Первоначальный: " + rectangle);

        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("После движения: " + rectangle);
    }
}
