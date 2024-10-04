package ru.mirea.practice.s0000006.task3;

public class Book implements Nameable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return title;
    }
}