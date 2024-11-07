package ru.mirea.practice.s23k0135.task3;

public class Person implements Nameable {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
