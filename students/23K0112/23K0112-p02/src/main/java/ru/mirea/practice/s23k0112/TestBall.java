package ru.mirea.practice.s23k0112;

public final class TestBall {
    private TestBall() {

    }

    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball.toString());

        ball.setX(2.3);
        ball.setY(6.8);
        System.out.println(ball.toString());

        ball.setXY(4.3, 2.9);
        System.out.println(ball.toString());

        ball.move(2, 3);
        System.out.println(ball.toString());
    }
}
