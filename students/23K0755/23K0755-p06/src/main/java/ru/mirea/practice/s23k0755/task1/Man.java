package ru.mirea.practice.s23k0755.task1;

//import ru.mirea.practice.s23k0155.task1.Nameable;

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
