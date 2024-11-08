package ru.mirea.practice.s23k0120.task2;

public class BoxColor {
    String name;
    java.awt.Color color;

    public BoxColor(String name, java.awt.Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
