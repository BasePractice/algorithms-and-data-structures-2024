package ru.mirea.practice.lab2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball testBall = new Ball(15.0, 12.0);
        testBall.move(4.5, -3);
        Ball testBall2 = new Ball();
        System.out.println("X первого мяча - " + testBall.getX());
        System.out.println("Y первого мяча - " + testBall.getY());
        System.out.println("--------------------");
        System.out.println("X второго  мяча - " + testBall2.getX());
        System.out.println("Y второго  мяча - " + testBall2.getY());
        testBall.setX(-4.12);
        testBall.setY(0);
        System.out.println(testBall);
        testBall2.setXY(3, -4.3);
        System.out.println(testBall2);
    }
}
