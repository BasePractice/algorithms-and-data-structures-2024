package ru.mirea.practice.s23k0169.t1;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 2);
        System.out.println("Первоначальный: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("После движения: " + point);

        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println("Первоначальный: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("После движения: " + circle);
    }
}
