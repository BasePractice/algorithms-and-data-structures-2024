package ru.mirea.practice.s23k0164.t2;

public final class TestBall {

    private TestBall() {

    }

    public static void main(String[] args) {
        Ball ball1 = new Ball(1.0, 2.0);
        System.out.println("Начальное положение мяча 1: " + ball1);

        ball1.setX(3.0);
        ball1.setY(4.0);
        System.out.println("После установки новых координат: " + ball1);

        ball1.setXY(5.0, 6.0);
        System.out.println("После установки XY: " + ball1);

        ball1.move(2.0, 2.0);
        System.out.println("После перемещения: " + ball1);

        Ball ball2 = new Ball();
        System.out.println("Мяч 2 (по умолчанию): " + ball2);

        System.out.println("Координата X мяча 2: " + ball2.getX());
        System.out.println("Координата Y мяча 2: " + ball2.getY());
    }
}