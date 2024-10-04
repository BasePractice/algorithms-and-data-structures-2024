package ru.mirea.practice.lab6.nameable;

public class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Planet: " + name;
    }
}
