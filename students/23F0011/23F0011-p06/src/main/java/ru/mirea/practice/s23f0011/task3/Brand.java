package ru.mirea.practice.s23f0011.task3;

public class Brand implements Nameable {
    private final String name;

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return "Brand{" + "Brand=" + name + '}';
    }
}