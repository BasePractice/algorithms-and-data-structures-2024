package ru.mirea.practice.s230k754.lab4p1.task3;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("fullname", 12);

        person.move();
        person2.talk();
    }
}
