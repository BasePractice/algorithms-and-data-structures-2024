package ru.mirea.practice.s23L0908.Task5_6;

public class Test {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(4, 5, 6, 7);
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
        Movable c1 = new MovableCircle(5, 7, 3, 1, 6);
        System.out.println(c1);
        c1.moveLeft();
        c1.moveUp();
        System.out.println(c1);
    }
}
