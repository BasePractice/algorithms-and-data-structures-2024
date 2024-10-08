package ru.mirea.practice.s23K0135.pw41.task3;

public abstract class TestPerson {
    public static void main(String[] args) {
        Person a = new Person("Alex P.", 99);
        Person b = new Person();

        a.move();
        b.talk();
        a.talk();
    }
}
