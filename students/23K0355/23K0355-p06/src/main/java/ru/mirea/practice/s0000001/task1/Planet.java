package ru.mirea.practice.s0000001.task1;

public class Planet implements Nameable {
    private String n;

    public Planet(String n) {
        this.n = n;
    }

    @Override
    public String getN() {
        return n;
    }
}