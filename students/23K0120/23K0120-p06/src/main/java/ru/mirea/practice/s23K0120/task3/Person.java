package ru.mirea.practice.s23K0120.task3;

public class Person implements Nameable {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
