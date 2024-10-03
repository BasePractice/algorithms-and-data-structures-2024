package ru.mirea.practice.s0000002;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0,0.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setX(10.0);
        ball.setY(5.0);
        ball.move(10.0,10.0);
        System.out.println(ball.toString());
    }
}
