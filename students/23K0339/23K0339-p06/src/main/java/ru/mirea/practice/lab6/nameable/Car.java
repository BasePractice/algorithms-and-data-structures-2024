package ru.mirea.practice.lab6.nameable;

public class Car implements Nameable {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Car: " + name;
    }
}
