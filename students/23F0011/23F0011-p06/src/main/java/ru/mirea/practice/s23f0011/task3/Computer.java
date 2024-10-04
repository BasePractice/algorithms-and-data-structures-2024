package ru.mirea.practice.s23f0011.task3;

public class Computer implements Nameable {
    private final String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return "Computer{" + "Computer=" + name + '}';
    }
}
