package ru.mirea.practice.s0000001.prog7;

public class Journal implements Printable {
    private final String name;


    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

}