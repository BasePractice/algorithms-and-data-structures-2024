package ru.mirea.practice.s0000001.prog3;

public abstract class Main {
    public static void main(String[] args) {
        Generalized<String, Dog, Integer> test = new Generalized<>("Hello", new Dog("Bobik"), 15);

        test.print();
    }
}
