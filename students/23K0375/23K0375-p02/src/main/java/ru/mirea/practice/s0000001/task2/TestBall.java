package ru.mirea.practice.s0000001.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.move(1.5, -2.0);
        System.out.println(ball);
    }
}