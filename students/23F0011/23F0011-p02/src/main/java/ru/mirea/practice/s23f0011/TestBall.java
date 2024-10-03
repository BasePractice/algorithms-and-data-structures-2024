package ru.mirea.practice.s23f0011;

public abstract class TestBall {
    public static void main(String[] args) {
        Ball obj1 = new Ball(4.3, 7.1);
        System.out.println(obj1.toString());
        obj1.move(3.7, 2.1);
        System.out.println(obj1.toString());
        Ball obj2 = new Ball();
        obj2.setXY(6.7, 8.1);
        System.out.println(obj2.toString());
    }
}
