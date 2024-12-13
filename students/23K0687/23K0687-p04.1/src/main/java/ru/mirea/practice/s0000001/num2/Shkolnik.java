package ru.mirea.practice.s0000001.num2;

public class Shkolnik extends Uchashchiesya {
    Shkolnik(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println("Школьник: " + name);
    }
}
