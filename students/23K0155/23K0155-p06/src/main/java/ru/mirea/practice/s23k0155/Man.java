package ru.mirea.practice.s23k0155;

public class Man implements Nameable {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
