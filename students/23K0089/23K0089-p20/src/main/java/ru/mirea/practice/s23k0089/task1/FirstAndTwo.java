package ru.mirea.practice.s23k0089.task1;

import ru.mirea.practice.s23k0089.task1.Triple;

public final class FirstAndTwo {
    private FirstAndTwo() {

    }

    public static void main(String[] args) {

        Triple<Integer, String, Integer> triple = new Triple<>(82, "NaN", 25);
        triple.printClassNames();
    }

}
