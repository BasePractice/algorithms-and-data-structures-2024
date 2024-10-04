package ru.mirea.practice.s0000001.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Movable a = new MovableRectangle(252.9, 13289.3, 1522.2632,1.5);
        MovableRectangle b = new MovableRectangle(14., 734.9, 125.2, 125.6);
        a.moveRight(15);
        b.moveDown(1251);
        System.out.println(a + "\n" + b);
    }
}
