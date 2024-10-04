package ru.mirea.practice.s23k0350.task1;

abstract class TestC {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(new MovablePoint(0,0,3,3), 10);
        System.out.println(c1.toString());
        c1.moveRight();
        c1.moveUp();
        System.out.println("-Изменено- " + c1.toString());
        c1.moveLeft();
        c1.moveLeft();
        c1.moveDown();
        c1.moveDown();
        System.out.println("-Изменено- " + c1.toString());
    }
}
