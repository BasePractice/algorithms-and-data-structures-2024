package ru.mirea.practice.s0000001.prog1;

public abstract class Main {
    public static void main(String[] args) {
        Generalized<String, Integer, Double> test = new Generalized<>("Hello", 125, 5.0);

        System.out.println(test);
    }
}
