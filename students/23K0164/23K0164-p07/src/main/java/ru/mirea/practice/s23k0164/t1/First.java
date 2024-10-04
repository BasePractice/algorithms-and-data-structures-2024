package ru.mirea.practice.s23k0164.t1;

public final class First {
    private  First() {

    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5);
        System.out.println(rectangle);

        rectangle.moveUP();
        System.out.println("После передвижения вверх: " + rectangle);

        rectangle.moveRight();
        System.out.println("После передвижения вправо: " + rectangle);

        rectangle.moveDown();
        System.out.println("После передвижения вниз: " + rectangle);

        rectangle.moveLeft();
        System.out.println("После передвижения влево: " + rectangle);
    }
}
