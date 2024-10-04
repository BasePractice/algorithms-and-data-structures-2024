package ru.mirea.practice.s0000001.task3;

public class Planet implements Nameable {
    int mass;
    private String name;
    int radius;

    public Planet(int mass, String name, int radius) {
        this.mass = mass;
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }
}
