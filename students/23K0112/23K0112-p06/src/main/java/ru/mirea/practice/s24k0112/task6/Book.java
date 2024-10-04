package ru.mirea.practice.s24k0112.task6;

public class Book implements Printable {
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("Book: %s\nAuthor: %s\n\n", name, author);
    }
}
