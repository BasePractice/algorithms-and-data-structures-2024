package ru.mirea.practice.s0000001.task2;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball a1 = new Ball();
        Ball a2 = new Ball(6.8,4.9);

        a1.setX(0.8);
        a1.setY(.345);
        System.out.println(a1.toString(1));

        a2.setXY(523.5,466.9);
        System.out.println(a2.toString(2));

        a2.move(4214.9,.123456789);
        System.out.println(a2.toString(2));
    }
}
