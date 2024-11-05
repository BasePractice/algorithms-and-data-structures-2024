package ru.mirea.practice.s23k0120.task1to3;

public abstract class Main {
    public static void main(String[] args) {
        GenericsTest<String, Monkey, Error> genericsTest = new GenericsTest<>("Hello, world!", new Monkey(), new Error());
        genericsTest.getVars();
    }
}
