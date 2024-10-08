package ru.mirea.practice.s23K0135.task2;

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
