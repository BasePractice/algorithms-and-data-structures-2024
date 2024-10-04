package ru.mirea.practice.s23k0690.task1;

abstract class MoveTest {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(new MovablePoint(0,0,10,10), 100);
        System.out.println(c1.toString());
        c1.moveRight();
        c1.moveUp();
        System.out.println("ref 1:" + c1.toString());
        for (int i = 0;i < 10;i++) {
            c1.moveRight();
            c1.moveDown();
        }
        System.out.println("ref 2:" + c1.toString());
    }
}