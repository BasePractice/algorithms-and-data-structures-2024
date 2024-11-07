package ru.mirea.practice.s23k0623;

public class Animal implements Nameable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

