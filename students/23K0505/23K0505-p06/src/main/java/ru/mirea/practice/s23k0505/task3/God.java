package ru.mirea.practice.s23k0505.task3;

public class God implements Nameable {
    private final String name;

    public God(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
