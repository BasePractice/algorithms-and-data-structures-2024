package ru.mirea.practice.s23k0505.task3;

public class Pet implements Nameable {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
