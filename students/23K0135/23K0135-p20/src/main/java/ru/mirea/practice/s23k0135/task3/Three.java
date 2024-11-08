package ru.mirea.practice.s23k0135.task3;

public final class Three {
    private Three() {

    }

    public static void main(String[] args) {
        Triple<String, Cat, Double> triple = new Triple<>("Hello", new Cat(7, "Китти"), 3.14);
        triple.printClassNames();
    }
}
