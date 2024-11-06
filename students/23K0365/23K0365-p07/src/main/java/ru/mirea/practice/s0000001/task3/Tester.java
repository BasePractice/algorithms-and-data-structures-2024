package ru.mirea.practice.s0000001.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Movable a = new MovableRectangle(252.9, 13289.3, 1522.2632,1.5);
        MovableRectangle b = new MovableRectangle(14., 734.9, 125.2, 125.6, 12.63, 236.4);
        a.moveRight(15);
        b.moveDown(1251);
        System.out.println(a + "\n" + b);
        System.out.println(b.speedTest());
        System.out.println(b.numberToString(b.xspeed));
    }
}
