package ru.mirea.practice.s23k0359.studyperson.task3;

public class Animals implements Nameable {
    private final String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}