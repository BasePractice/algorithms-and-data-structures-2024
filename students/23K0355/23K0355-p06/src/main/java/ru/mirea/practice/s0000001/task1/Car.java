package ru.mirea.practice.s0000001.task1;

public class Car implements Nameable {
    private String n;

    public Car(String n) {
        this.n = n;
    }

    @Override
    public String getN() {
        return n;
    }
}