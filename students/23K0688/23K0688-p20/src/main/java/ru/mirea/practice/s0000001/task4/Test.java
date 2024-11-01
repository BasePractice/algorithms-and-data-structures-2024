package ru.mirea.practice.s0000001.task4;

public abstract class Test {
    public static void main(String[] args) {
        Tvk<Integer, Double, Insect> tvk = new Tvk<>(16,16.6,new Insect("beetle"));
        tvk.printValues();
        tvk.printNames();
    }
}
