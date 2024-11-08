package ru.mirea.practice.s23k0135.task1and2;

public final class OneAndTwo {
    private OneAndTwo() {

    }

    public static void main(String[] args) {

        Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
        triple.printClassNames();
    }

}
