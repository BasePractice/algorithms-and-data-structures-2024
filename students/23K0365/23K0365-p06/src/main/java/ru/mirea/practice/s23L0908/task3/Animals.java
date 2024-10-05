package ru.mirea.practice.s23L0908.task3;

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
