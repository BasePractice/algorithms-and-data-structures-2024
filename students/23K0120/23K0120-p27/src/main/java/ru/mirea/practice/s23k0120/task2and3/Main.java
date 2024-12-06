package ru.mirea.practice.s23k0120.task2and3;

import ru.mirea.practice.s23k0120.task1.Hashtab;

public abstract class Main {
    public static void main(String[] args) {
        Hashtab<String, Double> constants = new Hashtab<>();
        constants.add("Pi", 3.1415926535897931);
        constants.add("E", 2.718281828459045);
        constants.add("Phi", 1.6180339887);
        constants.add("Sqrt2", 1.41421356237);

        System.out.println(constants.lookup("Pi"));
        System.out.println(constants.delete("Sqrt2"));
    }
}
