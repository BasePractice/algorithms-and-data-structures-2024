package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        Tvk<Integer, Double, String> tvk = new Tvk<>(16,16.6,"16,6");
        tvk.printValues();
        tvk.printNames();
    }
}
