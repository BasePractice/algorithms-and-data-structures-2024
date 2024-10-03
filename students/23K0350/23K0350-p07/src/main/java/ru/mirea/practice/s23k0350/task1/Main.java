package ru.mirea.practice.s23k0350.task1;


public abstract class Main {
    public static void main(String[] args) {
        MovableRect r1 = new MovableRect(new MovablePoint7(0,0,5), new MovablePoint7(10,10,5));
        System.out.println(r1.toString());
        r1.moveDown();
        r1.moveLeft();
        System.out.println("-Изменено- " + r1.toString());
    }
}