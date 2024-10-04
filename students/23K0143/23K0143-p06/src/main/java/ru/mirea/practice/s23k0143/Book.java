package ru.mirea.practice.s23k0143;

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title + " - Автор: " + author);
    }
}


