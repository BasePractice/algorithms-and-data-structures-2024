package ru.mirea.practice.s23k0164.t1;

public final class FirstAndTwo {
    private FirstAndTwo() {

    }

    public static void main(String[] args) {

        Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
        triple.printClassNames();
    }

}
