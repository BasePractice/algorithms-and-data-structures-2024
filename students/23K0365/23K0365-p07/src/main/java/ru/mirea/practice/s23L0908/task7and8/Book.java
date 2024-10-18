package ru.mirea.practice.s23L0908.task7and8;

public class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    static void printBook(Printable[] printable) {
        for (Printable x : printable) {
            if (x instanceof Book) {
                System.out.println(((Book) x).getTitle());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Type is book. " + "\tAuthor: "
                + author + "\tTitle: " + title);
    }
}