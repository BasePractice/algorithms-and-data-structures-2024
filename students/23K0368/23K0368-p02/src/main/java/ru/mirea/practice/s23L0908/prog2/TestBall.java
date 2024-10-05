package ru.mirea.practice.s23L0908.prog2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5, 10);
        System.out.println(ball);

        ball.move(3, 5);
        System.out.println(ball);
    }
}
