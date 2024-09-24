package ru.mirea.practice.s0000001.prog2;
import java.lang.*;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5, 10);
        System.out.println(ball);

        ball.move(3, 5);
        System.out.println(ball);
    }
}
