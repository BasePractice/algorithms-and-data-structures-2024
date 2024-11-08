package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        AnimalSerializable animal = new AnimalSerializable();
        Triple<String, AnimalSerializable, Integer> triple = new Triple<>("Hello", animal, 100);
        triple.printClassNames();
    }
}


