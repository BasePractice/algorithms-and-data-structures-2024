package ru.mirea.practice.s23L0908.prog7;

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