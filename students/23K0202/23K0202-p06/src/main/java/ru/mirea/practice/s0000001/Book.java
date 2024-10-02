package ru.mirea.practice.s0000001;

class Book implements Printable {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title + ", Автор: " + author);
    }
}