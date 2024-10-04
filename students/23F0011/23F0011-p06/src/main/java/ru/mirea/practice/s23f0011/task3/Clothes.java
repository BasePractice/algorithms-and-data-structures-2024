package ru.mirea.practice.s23f0011.task3;

public class Clothes implements Nameable {
    private final String name;

    public Clothes(String name) {
        this.name = name;
    }

    public String getName() {
        return "Clothes{" + "Clothes=" + name + '}';
    }
}
