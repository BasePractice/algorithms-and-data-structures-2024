package ru.mirea.practice.s23k0114.lab2;

public abstract class Task2TestBall {
    public static void main(String[] args) {
        Task2Ball b1 = new Task2Ball(0.0,0.0);
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
