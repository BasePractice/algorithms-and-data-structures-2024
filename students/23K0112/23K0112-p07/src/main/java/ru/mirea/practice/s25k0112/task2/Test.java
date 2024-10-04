package ru.mirea.practice.s25k0112.task2;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(1, 1);
        MovablePoint bottomRight = new MovablePoint(5, 5);
        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);

        System.out.println(rectangle.toString());
        rectangle.move(2, 3);
        System.out.println("После перемещения: " + rectangle.toString());
    }
}
