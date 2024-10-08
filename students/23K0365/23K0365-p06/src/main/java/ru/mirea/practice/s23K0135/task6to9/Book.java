package ru.mirea.practice.s23K0135.task6to9;

public class Book implements Printable {
    private String title;
    private String author;
    private String type;

    public Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Type is "
                + type + "\tAuthor: "
                + author + "\tTitle: " + title);
    }
}
