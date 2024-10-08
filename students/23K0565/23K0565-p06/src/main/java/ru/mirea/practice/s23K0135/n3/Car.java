package ru.mirea.practice.s23K0135.n3;

public class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car: " + name;
    }
}
