package ru.mirea.practice.s0000001.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Person a = new Person("qwert", "asdf", "zxcv");
        Person b = new Person("zxcv");
        System.out.println(a.getBack());
        System.out.println(b.getBack());
    }
}
