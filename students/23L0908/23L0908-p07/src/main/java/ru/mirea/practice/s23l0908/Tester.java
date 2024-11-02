package ru.mirea.practice.s23l0908;

public final class Tester {

    private Tester() {
    }

    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        MovableRectangle m2 = new MovableRectangle(1, 2, 3, 4, 20, 20);
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        if (m2.speedtest()) {
            System.out.println("Points have the same speed!");
        } else {
            System.out.println("Points do not have the same speed!");
        }
    }
}
