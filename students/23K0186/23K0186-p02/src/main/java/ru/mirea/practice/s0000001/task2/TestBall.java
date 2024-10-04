package ru.mirea.practice.s0000001.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(0.0,0.0);
        System.out.println(b1);
        System.out.println("x=" + b1.getX());
        System.out.println("y=" + b1.getY());
        b1.setX(0.5);
        System.out.println("x=" + b1.getX());
        b1.setY(0.5);
        System.out.println("y=" + b1.getY());
        b1.setXY(1.0,1.0);
        System.out.println("x=" + b1.getX());
        System.out.println("y=" + b1.getY());
        b1.move(0.5,0.5);
        System.out.println("x after move=" + b1.getX());
        System.out.println("y after move=" + b1.getY());
    }
}
