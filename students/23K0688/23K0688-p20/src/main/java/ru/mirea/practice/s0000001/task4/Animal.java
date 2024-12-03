package ru.mirea.practice.s0000001.task4;

public class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal:" + type;
    }
}
