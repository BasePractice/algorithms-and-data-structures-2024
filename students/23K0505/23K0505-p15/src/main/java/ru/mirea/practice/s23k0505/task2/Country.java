package ru.mirea.practice.s23k0505.task2;

public class Country {
    private final String name;
    private final String description;

    Country(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
