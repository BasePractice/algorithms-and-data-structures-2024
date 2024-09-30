package ru.mirea.practice.s230k754.lab6.task3;

public class Planet implements Nameable {
    private String name;

    Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}