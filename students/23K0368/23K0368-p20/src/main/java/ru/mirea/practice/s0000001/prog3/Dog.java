package ru.mirea.practice.s0000001.prog3;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Dog(String name) {
        super("Dog");  // Устанавливаем вид животного
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', species='" + getSpecies() + "'}";
    }
}


