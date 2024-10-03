package ru.mirea.practice.s23k0359.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball baller = new Ball();
        System.out.println(baller);
        baller.setXY(5, 5);
        System.out.println(baller);
        baller.move(11, -5);
        System.out.println(baller);
        baller.setX(60);
        System.out.println(baller);
    }
}

