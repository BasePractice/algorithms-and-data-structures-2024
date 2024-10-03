package ru.mirea.practice.lab6.nameable;

public class Animal implements Nameable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Animal: " + name;
    }
}
