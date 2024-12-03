package ru.mirea.practice.s23k0623.task2;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book title: " + title);
    }
}

