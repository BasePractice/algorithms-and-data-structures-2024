package ru.mirea.practice.s23k0089.task2und3;

import ru.mirea.practice.s23k0089.task1.Hashtab;

public abstract class Main {
    public static void main(String[] args) {
        Hashtab<String, Double> constants = new Hashtab<>();
        constants.add("Age", 18.4543865394);
        constants.add("E", 2.718281828459045);
        System.out.println(constants.lookup("E"));
        System.out.println(constants.delete("Age"));
    }
}
