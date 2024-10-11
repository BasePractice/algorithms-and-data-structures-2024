package ru.mirea.practice.s230k754.lab2.task2;

public final class TestBall {
    private TestBall() {}

    public static void main(String[] args) {
        Ball b1 = new Ball(0.0, 0.0);
        Ball b2 = new Ball();
        System.out.println(b1.toString());

        b2.setXY(23.23, 345.34);
        System.out.println(b2.toString());

        b1.setX(1.1);
        b1.setY(2.2);
        System.out.println(b1.toString());

        System.out.println(b1.toString());
    }
}
