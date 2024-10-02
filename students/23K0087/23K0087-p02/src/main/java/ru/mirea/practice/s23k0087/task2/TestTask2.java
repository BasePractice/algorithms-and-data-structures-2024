package ru.mirea.practice.s23k0087.task2;

public abstract class TestTask2 {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 20);
        System.out.println(ball.toString());
        ball.move(10, -20);
        System.out.println(ball.toString());
        ball.setXY(10, 20);
        System.out.println(ball.toString());
        ball.setX(-10);
        ball.setY(-20);
        System.out.println(ball.toString());
        System.out.println("x = " + ball.getX() + ", y = " + ball.getY());
    }
}
