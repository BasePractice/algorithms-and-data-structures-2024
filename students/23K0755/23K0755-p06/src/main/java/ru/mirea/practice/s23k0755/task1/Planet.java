package ru.mirea.practice.s23k0755.task1;

//import ru.mirea.practice.s23k0155.task1.Nameable;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

