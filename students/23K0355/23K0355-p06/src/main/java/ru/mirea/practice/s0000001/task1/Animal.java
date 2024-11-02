package ru.mirea.practice.s0000001.task1;

public class Animal implements Nameable {
    private String n;

    public Animal(String n) {
        this.n = n;
    }

    @Override
    public String getN() {
        return n;
    }
}