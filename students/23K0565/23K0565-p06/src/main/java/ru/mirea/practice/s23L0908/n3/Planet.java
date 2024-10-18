package ru.mirea.practice.s23L0908.n3;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet: " + name;
    }
}