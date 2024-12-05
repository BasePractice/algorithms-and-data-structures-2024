package ru.mirea.practice.s23k0114.lab1.task1;


public abstract class Main {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Test", 123, 45.67);

        System.out.println(triple);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());
    }
}

