package ru.mirea.practice.s23l0908.task3;

public class Car implements Nameable {
    private final String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("The car is: " + this.name);
    }
}
