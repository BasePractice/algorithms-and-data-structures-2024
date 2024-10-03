package ru.mirea.practice.s0000001.task3;

public class Animals implements Nameable {
    int mass;
    private String name;

    public Animals(int mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
