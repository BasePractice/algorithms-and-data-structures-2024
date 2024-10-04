package ru.mirea.practice.s0000002.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 2.0);

        System.out.println("Initial Position: " + ball.toString());

        ball.move(3.0, 4.0);
        System.out.println("After Move: " + ball.toString());

        ball.setXY(5.0, 6.0);
        System.out.println("After SetXY: " + ball.toString());
    }
}