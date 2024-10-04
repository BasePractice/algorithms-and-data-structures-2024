package ru.mirea.practice.s0000007.task6789;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}