package ru.mirea.practice.s0000001.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Movable a = new MovableRectangle(252.9, 13289.3);
        MovableRectangle b = new MovableRectangle(14., 734.9);
        a.moveRight(15);
        b.moveDown(1251);
        System.out.println(a + "\n" + b);
    }
}
