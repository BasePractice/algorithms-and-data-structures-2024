package ru.mirea.practice.s23k0362.task2;

abstract class TestBall {
    public static void main(String[] args) {
        Ball aut1 = new Ball(15, 15);
        System.out.println(aut1);
        aut1.setX(54.5);
        System.out.println(aut1.getX());
        aut1.setY(54.5);
        System.out.println(aut1.getY());
        aut1.setX(152.21);
        System.out.println(aut1.getX());
        aut1.setY(-1383.212);
        System.out.println(aut1.getY());
        aut1.setXY(0, 0);
        System.out.println(aut1);
        aut1.move(-5, 7);
        System.out.println(aut1);
    }
}
