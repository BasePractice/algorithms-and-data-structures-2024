package ru.mirea.practice.s23k0505.task2;

public final class Three {
    private Three() {

    }

    public static void main(String[] args) {
        Triple<String, Dog, Double> triple = new Triple<>("Hello", new Dog(20, "Боби"), 3.14);
        triple.printClassNames();
    }

}
