package ru.mirea.practice.s0000001.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 2.0, 3.0, 4.0);

        System.out.println("Initial ball state: " + ball.toString());

        ball.move();
        System.out.println("After move: " + ball.toString());

        ball.reflectHorizontal();
        System.out.println("After horizontal reflection: " + ball.toString());

        ball.reflectVertical();
        System.out.println("After vertical reflection: " + ball.toString());

    }
}